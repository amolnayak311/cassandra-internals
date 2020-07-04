package com.github.amolnayak.cassandra.commitlog;

import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Inspired by org.apache.cassandra.db.commitlog.MemoryMappedSegment.Commit log
 * is an append only file where the inserts/updates/deletes (Mutation) are
 * appended to before writing them. to in memory structure MemTable. The
 * commitlogs are essential to recreate the memtable in case the node crashes.
 * Once the contents of memtable are written to SSTable, the persistent storage,
 * the commit log is no longer necessary. Cassandra's commit log has various
 * implementations, from a simple MemoryMap based to an encrypted and compressed
 * commit logs. The goal of this activity is how exactly to implement a append
 * only, Log Style file efficiently.
 * 
 * The actual implementation in Cassandra doesn't not add the data directly to
 * CommitLogSegment but returns an Allocator which contains the portion of the
 * commitlog to which the write will happen. So essentially CommitLog gets a
 * Mutation to write and uses an implementation of
 * AbstractCommitLogSegmentManager to get an allocation of segment(part of a
 * commit log) to write to. It then notifies an implementation of
 * AbstractCommitLogService for syncing the file containing the segment
 * 
 * 
 * @author Amol Nayak
 *
 */
public class MMapCommitLogSegment implements ICommitLogSegment {

	private static Logger logger = LoggerFactory.getLogger(MMapCommitLogSegment.class);
	private static AtomicInteger fileSeq = new AtomicInteger(0);
	private final ByteBuffer buffer;
	private final AtomicInteger bufferTail = new AtomicInteger();
	private final int capacity;
	private final File commitLogFile; 
	
	
	public MMapCommitLogSegment(String dir, String file, int maxBufferSize) throws Exception {
		this.commitLogFile = new File(new File(dir), file);
		FileChannel channel = FileChannel.open(
				commitLogFile.toPath(),
				StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);
		logger.info("Creating new MMapCommitLogSegment at {}", commitLogFile.getAbsolutePath());
		this.capacity = maxBufferSize;
		this.buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, maxBufferSize);
	}
	
	/**
	 * 
	 * @param dir
	 * @param maxBufferSize
	 * @throws Exception
	 */
	public MMapCommitLogSegment(String dir, int maxBufferSize) throws Exception {
		this(dir, "commitlog_" + fileSeq.incrementAndGet(), maxBufferSize);
		
	}

	@Override
	public Allocation allocate(int nBytes) {
		while (true) {
			int start = bufferTail.get();
			int end = start + nBytes;
			if (end > capacity) {
				return null;
			}
			if (bufferTail.compareAndSet(start, end)) {
				return new Allocation(start, nBytes, (ByteBuffer)buffer.duplicate().position(start).limit(end), commitLogFile.getAbsolutePath());
			}
		}
	}

	@Override
	public void writeLogHeader() {
		// NOP for now
	}

	@Override
	//testing, not threadsafe
	public List<byte[]> readAll() {
		ByteBuffer buff = (ByteBuffer)buffer.duplicate().position(0).limit(capacity);
		int max = bufferTail.get();
		logger.info("Reading all contents of byte buffer, {} bytes available for reading ", max);
		int i = 0;
		long start = System.currentTimeMillis();
		List<byte[]> content = new ArrayList<>(); 
		while(i < max) {
			int len = buff.getInt();
			byte[] bytes = new byte[len];
			buff = buff.get(bytes);
			content.add(bytes);
			i += len + 4;
		}
		long end = System.currentTimeMillis();
		logger.info("Read {} entries from commit log in {} ms", content.size(), end - start);
		return content;
	}
	// TODO: Understand how OpOrder works, see implementation and nuances of sync in
	// details.

}
