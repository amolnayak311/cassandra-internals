/**
 * 
 */
package com.github.amolnayak.cassandra.commitlog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import com.github.amolnayak.cassandra.commitlog.ICommitLogSegment.Allocation;

/**
 * @author Amol Nayak
 *
 */
public class CommitLogSegmentManagerTest {

	@Test
	public void allocateNewSegment() throws Exception {
		CommitLogSegmentManager mgr = new CommitLogSegmentManager(2, 10);
		mgr.start();
		int nThreads = 20;
		ExecutorService svc = Executors.newFixedThreadPool(nThreads);
		ConcurrentLinkedQueue<Allocation> allocations = new ConcurrentLinkedQueue<>();
		CountDownLatch latch = new CountDownLatch(nThreads);
		for(int i = 0; i < nThreads; i++) {
			svc.execute(() -> {
				try {
					Allocation alloc = mgr.allocate(10);
					allocations.add(alloc);
					latch.countDown();
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			});
		}
		latch.await();
		assertEquals(nThreads, allocations.size());
		Set<String> commitLogFiles = new HashSet<>();
		for(int i = 0; i < nThreads; i++) {
			Allocation alloc = allocations.poll();
			assertEquals(0, alloc.getStart());
			assertEquals(10, alloc.getLength());
			commitLogFiles.add(alloc.getClFile());
		}
		assertEquals(nThreads, commitLogFiles.size());
		mgr.stop();
		svc.shutdown();
	}
	
	
	@Test
	public void allocateSegmentsSameCommitLog() throws Exception {
		CommitLogSegmentManager mgr = new CommitLogSegmentManager(2, 1024);
		mgr.start();
		int nThreads = 20;
		ExecutorService svc = Executors.newFixedThreadPool(nThreads);
		ConcurrentLinkedQueue<Allocation> allocations = new ConcurrentLinkedQueue<>();
		CountDownLatch latch = new CountDownLatch(nThreads);
		for(int i = 0; i < nThreads; i++) {
			svc.execute(() -> {
				try {
					Allocation alloc = mgr.allocate(10);
					allocations.add(alloc);
					latch.countDown();
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			});
		}
		latch.await();
		assertEquals(nThreads, allocations.size());
		Set<String> commitLogFiles = new HashSet<>();
		List<Integer> idx = new ArrayList<>();
		for(int i = 0; i < nThreads; i++) {
			Allocation alloc = allocations.poll();
			idx.add(alloc.getStart());
			commitLogFiles.add(alloc.getClFile());
		}
		Collections.sort(idx);
		assertEquals(1, commitLogFiles.size());
		//Ensure, all start indices retrieved are 10 positions apart and nothing overlaps
		for(int i = 0, index = 0; i < nThreads * 10; i += 10, index++) {
			assertEquals(i, idx.get(index));
		}
		mgr.stop();
		svc.shutdown();
	}
	
	
	@Test
	public void writeBytes() throws Exception {
		CommitLogSegmentManager mgr = new CommitLogSegmentManager(2, 16 * 1024);
		mgr.start();
		int nItems = 1000;
		
		AtomicLong totalMs = new AtomicLong();
		IntStream.range(1, nItems + 1).parallel().mapToObj(i -> {
			String s = "TEST" + i;
			return s.getBytes(Charset.defaultCharset());
		}).forEach( b -> {
			long start = System.currentTimeMillis();
			mgr.add(b);
			long end = System.currentTimeMillis();
			totalMs.addAndGet(end - start);
		});
		
		System.out.printf("time to insert per item is %.2f ms\n", 1.0* totalMs.get() / nItems);
		mgr.stop();		
		
		ICommitLogSegment cl = mgr.getAlocatingFrom();
		Set<String> allContent = cl.readAll().stream()
				.map(String :: new).collect(Collectors.toSet());
		assertEquals(nItems, allContent.size());
		for(int i = 1; i < nItems + 1; i++) {
			assertTrue(allContent.contains("TEST" + i));
		}
	}
	
}
