package com.github.amolnayak.cassandra.utils.btree;

import static com.github.amolnayak.cassandra.utils.btree.BTree.FAN_SHIFT;

import java.util.Collection;

/**
 * Refer to org.apache.cassandra.utils.btree.TreeBuilder in cassandra source code for original
 * implementation
 * 
 * @author Amol Nayak
 *
 */
public class TreeBuilder {
	
	
	private NodeBuilder rootBuilder = new NodeBuilder();
	
	private TreeBuilder() {
		
	}
	
	/**
	 * Simplified way to build an instance without using any object pooling but provide identical
	 * inteface
	 * 
	 * @return
	 */
	public static TreeBuilder newInstance() {
		return new TreeBuilder();
	}
	
	/**
	 * 
	 * @param iterable
	 * @param size
	 * @return
	 */
	<K> Object[] build(Collection<K> iterable, int size) {
		
		NodeBuilder current = rootBuilder;
		
		// With FAN_FACTOR keys on each level, to accomodate size keys, we need
		// log(size) with base FAN_FACTOR.  FAN_SHIFT is that number and hence we create
		// levels starting from root using size and FAN_SHIFT
		while ((size >>= FAN_SHIFT) > 0) {
			current = current.ensureChild();
		}
		
		current.makeLeaf();
		
		
		for (K k: iterable) {
			current.addNewKey(k);
		}
		
		current = current.ascendToRoot();

        return current.toNode();
		
	}

}
