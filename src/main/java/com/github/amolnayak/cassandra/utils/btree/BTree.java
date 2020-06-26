package com.github.amolnayak.cassandra.utils.btree;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;


/**
 * 	Super simplfied implementation inspired by Cassandra's BTree. This implementation 
 *  doesn't support updates but once created, all you can do is lookup, find and size
 *  
 *  Each level of Btree has the following structure
 *	[children 1] <Key 1> [children 2] <Key 2> [children 3]
 *	Above is an example a level with fanfactor 2, since there are 2 keys
 *	[children 1] will values values less than Key 1, key 1 < [children 2] < Key 2
 *	[children 3] > Key 2. As we see, the number of children will be 1 more than fanfactor
 *	for any fanfactor we choose.
 *
 *  The way its actually stored in array is as below
 *  [V1, V2, ..., child[&lt;V1.key], child[&lt;V2.key], ..., child[&lt; Inf], size]
 *  
 *  The size is array to store thus is facfactor (for keys) + fanfactor + 1 (for children) + 1 (size)
 *  = 2*fanfactor + 2
 *  
 *  Refer to org.apache.cassandra.utils.btree.BTree in Cassandra source code for
 *  original implementation
 *  
 *  The original implementation has lot more details around optimization, measuring memory usage 
 *  etc. These aren't specific to BTree implementation and my code skips those details.
 */
public class BTree {

	static final int FAN_SHIFT;
	static Object POSITIVE_INFINITY = new Object();
    static Object NEGATIVE_INFINITY = new Object();
    static
    {
        int fanfactor = 4;
        if (System.getProperty("cassandra.btree.fanfactor") != null)
            fanfactor = Integer.parseInt(System.getProperty("cassandra.btree.fanfactor"));
        int shift = 1;
        while (1 << shift < fanfactor)
            shift += 1;
        FAN_SHIFT = shift;
    }
    // FAN_FACTOR will be a power of 2, no matter what fanfactor you provide and not a power
    // of two, next higher power of 2 will be chosen, e.g. if its 5, the FAN_FACTOR 
    // will be next higher power of 2, which is 8
    static final int FAN_FACTOR = 1 << FAN_SHIFT;
    static final Object[] EMPTY_LEAF = new Object[1];
    static final Object[] EMPTY_BRANCH = new Object[]{null, new Object[0]};
    
    
    /**
     * 
     * @param <K>
     * @param collection
     * @return
     */
    @SuppressWarnings("unchecked")
	public static <K> Object[] build(Collection<K> collection) {
    	if(collection.size() <= FAN_FACTOR) {
    		//Leaves are always of odd length and branches of even length
    		// Making least significant bit to 1 makes the number odd
    		K[] res = (K[]) new Object[collection.size() | 1];
    		int i = 0;
    		for(K item: collection) {
    			res[i++] = item;
    		}
    		return res;
    	} else {
    		TreeBuilder builder = TreeBuilder.newInstance();
    		return builder.build(collection, collection.size());
    	}
    }    
    /**
     * 
     * @param btree
     * @return
     */
    public static int size (Object[] btree) {
    	
    	//Two cases
    	int length = btree.length;  
    	if((length & 1) == 1) {
    		//Return true length of leaf, if the last element of array is null, the leaf has even elements
    		//e.g. [1, 2 , null] has length 2 where as [1, 2, 3] has length 3
    		return btree[length - 1] == null ? length - 1: length;
    	} else {
    		// its a branch The structure of branch, for an example with FAN_FACTOR of 3
    		// is [k1, k2, k3, [c1], [c2], [c3], [c4], [index of keys, which is of size FAN_FACTOR + 1]]
    		// the size if the value of last element of the last item in above array.
    		// the last element is at index length -1, the size of the branch (length) is 2* FAN_FACTOR + 2 = 2*(FAN_FACTOR + 1)
    		// the last element of the length / 2 - 1
    		return ((int[])btree[length -1])[length / 2 - 1];
    		
    	}
    }
    
    /**
     * 
     * @param node
     * @return
     */
    static boolean isLeaf(Object[] node) {
        return (node.length & 1) == 1;
    }
    
    /**
     * 
     * @param node
     * @return
     */
    static int getKeyEnd(Object[] node) {
        if (isLeaf(node))
            return getLeafKeyEnd(node);
        else
            return getBranchKeyEnd(node);
    }

    // get the last index that is non-null in the leaf node
    static int getLeafKeyEnd(Object[] node) {
        int len = node.length;
        return node[len - 1] == null ? len - 1 : len;
    }

    // return the boundary position between keys/children for the branch node
    // == number of keys, as they are indexed from zero
    static int getBranchKeyEnd(Object[] branchNode) {
        return (branchNode.length / 2) - 1;
    }
    
    
    /**
     * Returns true if V found in tree else false
     * 
     * @param <V>
     * @param btree
     * @param comparator
     * @param key
     * @return
     */
    @SuppressWarnings("unchecked")
	static <V> boolean find(Object[] btree, Comparator<V> comparator, V key) {
    	Object[] node = btree;
    	while(true) {
    		int keyEnd = getKeyEnd(node);
    		int idx = Arrays.binarySearch(((V[])node), 0, keyEnd, key, comparator);
    		if(idx >= 0) {
    			return true;
    		}
    		if(isLeaf(node)) {
    			return false;
    		}
    		
    		idx = -idx - 1;
    		node = (Object[])node[keyEnd + idx];
    	}
    }
}
