/**
 * 
 */
package com.github.amolnayak.cassandra.utils.btree;

import static com.github.amolnayak.cassandra.utils.btree.BTree.FAN_FACTOR;

/**
 * Original reference source code is org.apache.cassandra.utils.btree.NodeBuilder
 * 
 * @author nayaamo
 *
 */
public class NodeBuilder {
	
    
	private final int maxKeys;
	private NodeBuilder parent;
	private NodeBuilder child;
	private boolean isLeaf;
	private Object[] buildKeys;
	private Object[] buildChildren;
	private int buildKeyPosition;
	private int buildChildPosition;
	
	// TODO: need to use this later, essentially stores the upper bound of a node in the tree.
	// if, the value to be inserted is beyond this upper bound, then it means the insertion need to traverse
	// up te tree till it finds the upperbound > value to be inserted in which case the insertion need to happen in the
	// subtree we currently are at. if this upper bound is null, its the root (or its same as setting it to infinity?)
	private Object upperBound;
	
	
	/**
	 * 
	 * @param fanFactor
	 * @param isLeaf
	 */
	public NodeBuilder(boolean isLeaf) {
		//Why that + 1? , recall from description of BTree, if we have FAN_FACTOR keys, we
		//have FAN_FACTOR + 1 children, thus we have a total of FAN_FACTOR * 2 + 1 entries  
		this.maxKeys = FAN_FACTOR * 2 + 1;
		this.isLeaf = isLeaf;
		this.buildKeys = new Object[maxKeys];
		// children is 1 + FAN_FACTOR, check Btree's class comments for why this is the case. 
		this.buildChildren = new Object[1 + maxKeys];
	}
	
	
	/**
	 * 
	 * @param offset
	 * @param keyLength
	 * @return
	 */
	private Object[] buildFromRange(int offset, int keyLength) {
		if(keyLength == 0) {
			return new Object[0];
		} else {
			//Two cases, this is a leaf or this is a branch			
			Object[] res;
			if(isLeaf) {
				//Easy one, If this is a leaf, it means after split, we split the leaf in two leaves.
				//this means the split needs to have odd length as thats the convention we follow
				res = new Object[keyLength | 1];
				System.arraycopy(buildKeys, offset, res, 0, keyLength);
			} else {
				// This is the case when the node is not a leaf, we thus have to consider both keys and children
				// Remember for keyLength keys, there are keyLength + 1 children, and then 1 element to index offsets
				//requiring an array of size 2 + keyLength * 2 
				res = new Object[2 + keyLength * 2];

				// Copy keyLength keys
				System.arraycopy(buildKeys, offset, res, 0, keyLength);
				
				// Copy keyLength + 1 children
				System.arraycopy(buildChildren, offset, res, keyLength, keyLength + 1);
				
				//Finally the size of Btree under this node
				//for keyLength, we have keyLength keys and keyLength + 1 children. [k_1, k_2.. k_n, [c_1], [c_2]...[c_n], [c_(n + 1)]]
				// The c_n, the child is itself a btree thus the size of this tree is recursively calculated as follows
				//sum(BTree.size(child) for child in children) + keyLength
				// howeverm its not just the entire tree's size but the size of the tree for each subtree is what we are interested an 
				// thats whats calculated below. The final indexOffset is same as the valu calculated by the above expression we gave 
				
	            // calculate the indexOffsets of each key in this node, within the sub-tree rooted at this node
	            int[] indexOffsets = new int[keyLength + 1];
	            int size = BTree.size((Object[]) res[keyLength]);
	            for (int i = 0 ; i < keyLength ; i++)
	            {
	                indexOffsets[i] = size;
	                size += 1 + BTree.size((Object[]) res[keyLength + 1 + i]);
	            }
	            indexOffsets[keyLength] = size;
	            res[res.length - 1] = indexOffsets;

				
			}
			return res;
		}
		
	}
	
	/**
	 * 
	 * @param child
	 * @param upperBound
	 */
	private void addExtraChild(Object[] child, Object upperBound) {
		// Notice how this addExtraChild and ensureRoom gets recursively called till the node is 
		// correctly inserted not violating the FAN_FACTOR of the branch 
		ensureRoom(buildKeyPosition + 1);
        buildKeys[buildKeyPosition++] = upperBound;
        buildChildren[buildChildPosition++] = child;
	}
	
	/**
	 * 
	 * @param child
	 */
	private void finishChild(Object[] child) {
		//adds a child thats expected, the caller guarantees this doesnt violate the constraints of the tree
		buildChildren[buildChildPosition++] = child;
	}
	
	/**
	 * 
	 * @param nextBuildKeyPosition
	 */
	private void ensureRoom(int nextBuildKeyPosition) {
		
		//Case 1: If nextBuildKeyPosition is under maxKeys, we alreday have room
		if(nextBuildKeyPosition < maxKeys)
			return;
		
		//If adding this new key exceeds the maxKeys value (FAN_FACTOR * 2 + 1), we need to 
		//move keys to parent. Check out buildFromRange for how it deals with nodes
		//which are leaves and those which are branches. Either ways, flushUp
		// flushUp is that part of of this branch that we split and add as another child
		// to its parent, this happens until the tree respects the FAN_FACTOR per branch
		
		Object[] flushUp = buildFromRange(0, FAN_FACTOR);
		ensureParent().addExtraChild(flushUp, buildKeys[FAN_FACTOR]);
		
		//Now that we have pushed half the current branch up, we need to shift the second half
		//of keys to left and reduce the size of the occupied keys accordingly
        int size = FAN_FACTOR + 1;
        System.arraycopy(buildKeys, size, buildKeys, 0, buildKeyPosition - size);
        buildKeyPosition -= size;
        
        // Check if children exist, this happens for non leaf nodes and if buildChildren has values.
        // which can be identified by value of buildChildPosition. If this is non zero, then
        // so a similar move to shift the half on right to left. The  first half is already taken care by
        // buildFromRange
        
        if (buildChildPosition > 0) {
            System.arraycopy(buildChildren, size, buildChildren, 0, buildChildPosition - size);
            buildChildPosition -= size;
        }
    }

	/**
	 * 
	 * @param fanFactor
	 */
	public NodeBuilder() {
		this(false);
	}
	
	/**
	 * Ensures there is a child, if not found, set one and set its parent to current NodeBuilder
	 * @return
	 */
	NodeBuilder ensureChild() {
		if(this.child == null) {
			this.child = new NodeBuilder();
			this.child.parent = this;
		}
		return this.child;
	}
	
	
	/**
	 * Similar to {@link #ensureChild()}, this initializes parent if null and returns it
	 * @return
	 */
	NodeBuilder ensureParent() {
		if(this.parent == null) {
			// If this happens it means we overflowed from the initial hierarchy created based on size 
			this.parent = new NodeBuilder();
			//If this parent is initialized now, then the upperbound of this parent is same as the upper bound if this node
			// being added
			this.parent.upperBound = upperBound;
			parent.child = this;
		}
		return this.parent;
	}
	
	/**
	 * 
	 * @return
	 */
	private boolean isRoot() {
		// check buildKeyPosition < FAN_FACTOR is necessary. If not, then this node will be split up in two and a new parent 
		// will be created which then becomes the root
		return (parent == null || parent.upperBound == null) && buildKeyPosition <= FAN_FACTOR;
	}
	
	/**
	 * 
	 * @return
	 */
	private NodeBuilder ascend() {
		ensureParent();
		
		if(buildKeyPosition > FAN_FACTOR) {
			//If number of keys are more than fanfactor, split the keys and 
			//for example if we have [1, 2, 3, 4, 5]
			//mid = 5 / 2 = 2 (index is 2, thus the element at that index is 3)
			// we will get two spilts, first is [1, 2] with upperbound 3 and the second child is [4, 5]
			// The node / subtree thus becomes [3, [1, 2, null], [4, 5, null], [index of keys]]
			// Extra null is because those are leaves and array has odd length 
			int mid = buildKeyPosition / 2;
			parent.addExtraChild(buildFromRange(0, mid), this.buildKeys[mid]);
			parent.finishChild(buildFromRange(mid + 1, buildKeyPosition - mid - 1));
		} else {
			parent.finishChild(buildFromRange(0, buildKeyPosition));
		}
		return parent;
	}
	
	/**
	 * 
	 * @return
	 */
	NodeBuilder ascendToRoot() {
        NodeBuilder current = this;
        while (!current.isRoot())
            current = current.ascend();
        return current;

	}
	
	Object[] toNode() {
		return buildFromRange(0, buildKeyPosition);
	}
	
	/**
	 * 
	 * @param key
	 */
	void addNewKey(Object key) {		
		ensureRoom(buildKeyPosition + 1);
        buildKeys[buildKeyPosition++] =key;
	}
	
	/**
	 * Makes this node a leaf.
	 * @return
	 */
	void makeLeaf() {
		this.isLeaf = true;
	}

}
