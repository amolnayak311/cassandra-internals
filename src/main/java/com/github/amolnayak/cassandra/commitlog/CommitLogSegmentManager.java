/**
 * 
 */
package com.github.amolnayak.cassandra.commitlog;

import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.amolnayak.cassandra.commitlog.ICommitLogSegment.Allocation;

/**
 * @author Amol Nayak
 *
 */
public class CommitLogSegmentManager {

	private static Logger logger = LoggerFactory.getLogger(CommitLogSegmentManager.class);
	
	private final Semaphore prefetchSemaphore;
	private volatile ICommitLogSegment allocatingFrom;
	private BlockingQueue<ICommitLogSegment> prefetched;
	private volatile boolean running;
	private final int maxBufferSize;

	public CommitLogSegmentManager(int maxPrefetchCommitLogSegments, int maxBufferSize) throws Exception {
		this.prefetchSemaphore = new Semaphore(maxPrefetchCommitLogSegments);
		this.prefetched = new ArrayBlockingQueue<ICommitLogSegment>(maxPrefetchCommitLogSegments);
		this.maxBufferSize = maxBufferSize;
		this.allocatingFrom = createSegment();
	}
	
	
	/**
	 * Add bytes to commit log, in Cassandra its CommitLog that has the add for mutation but
	 * for our purpose we care to write few bytes along with the length of the bytes written,
	 * we don't care about CRC for now.
	 *  
	 * @param bytes
	 */
	public void add(byte[] bytes) {		
		int len = bytes.length;
		Allocation alloc = allocate(len + 4); // Allocate space for byte[] and 4 extra bytes for length
		ByteBuffer buff = alloc.getBuffer();
		buff.putInt(len);
		buff.put(bytes);
	}

	/**
	 * 
	 * @param nBytes
	 * @return
	 */
	Allocation allocate(int nBytes) {

		logger.info("Allocating {} bytes", nBytes);
		Allocation allocation = null;
		while(true) {
			ICommitLogSegment segment = this.allocatingFrom;
			allocation = segment.allocate(nBytes);
			if(allocation == null) {
				synchronized (this) {
					if(segment == this.allocatingFrom) {
						try {
							this.allocatingFrom = prefetched.take();
							prefetchSemaphore.release();
						} catch (InterruptedException e) {
							throw new RuntimeException("Interrupted", e);
						}
					}
				}
			} else {
				break;
			}
		}
		return allocation;
	}
	
	private ICommitLogSegment createSegment() throws Exception {
		ICommitLogSegment segment = new MMapCommitLogSegment(System.getProperty("java.io.tmpdir"), this.maxBufferSize);
		segment.writeLogHeader();
		return segment;
	}
	
	public void start() {
		this.running = true;
		
		//A single thread that prefetches the segments.
		//Initially there are maxPrefetchCommitLogSegments permits which this thread will use
		//up and prefetch the segments, and then will wait till more permits are available
		//we use tryAcquire with 100 ms timeout to let us check the running status of the thread
		//check the allocate method which makes a permit available whenever a prefetched segment
		//is consumed
		Thread prefetcher = new Thread(() -> {
			try {
				while(this.running) {
					if(prefetchSemaphore.tryAcquire(100, TimeUnit.MILLISECONDS)) {
						prefetched.add(createSegment());
					}
				}
				logger.info("Stopping prefetcher");
			} catch (Exception e) {
				// Exit the service here , lets not worry about that now 
				throw new RuntimeException("Interrupted", e);
			}
		});
		prefetcher.start();
	}
	
	//testing 
	public ICommitLogSegment getAlocatingFrom() {
		return this.allocatingFrom;
	}
	
	public void stop() {
		// This will simply stop the prefetcher thread.
		this.running = false;
		//Other activities would be to release the unused prefetched segments
	}
}
