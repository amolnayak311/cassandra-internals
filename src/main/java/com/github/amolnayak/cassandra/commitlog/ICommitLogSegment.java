/**
 * 
 */
package com.github.amolnayak.cassandra.commitlog;

import java.nio.ByteBuffer;
import java.util.List;

/**
 * @author nayaamo
 *
 */
public interface ICommitLogSegment {
	
	/**
	 * 
	 * @param nBytes
	 * @return
	 */
	ICommitLogSegment.Allocation allocate(int nBytes);
	
	/**
	 * 
	 */
	void writeLogHeader();
	
	/**
	 * Returns all bytes serialized to this segment from start of the segment
	 * 
	 * for testing 
	 * @return
	 */
	List<byte[]> readAll();
	
	
	public static class Allocation {
		
		private final int start;
		private final int length;
		private final ByteBuffer buffer;
		//For testing only
		private final String clFile;
		

		
		

		public Allocation(int start, int length, ByteBuffer buffer, String clFile) {
			super();
			this.start = start;
			this.length = length;
			this.buffer = buffer;
			this.clFile = clFile;
		}


		
		/**
		 * 
		 * @return
		 */
		public String getClFile() {
			return clFile;
		}




		/**
		 * 
		 * @return
		 */
		public ByteBuffer getBuffer() {
			return buffer;
		}



		/**
		 * 
		 * @return
		 */
		public int getStart() {
			return start;
		}

		/**
		 * 
		 * @return
		 */
		public int getLength() {
			return length;
		}
		
	}

}
