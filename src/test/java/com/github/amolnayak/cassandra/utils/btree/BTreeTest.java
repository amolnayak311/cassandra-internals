/**
 * 
 */
package com.github.amolnayak.cassandra.utils.btree;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
/**
 * @author nayaamo
 *
 */
public class BTreeTest {
	
	
	@Test
	public void constructFromCollection() {
		Object[] tree = BTree.build(IntStream.range(0, 10).boxed().collect(Collectors.toList()));
		System.out.println(tree);
		//TODO: How to assert the tree is correctly built or not
	}
	
	@Test
	public void search() {
		Object[] tree = BTree.build(IntStream.range(0, 10).boxed().collect(Collectors.toList()));
		Comparator<Integer> intComparator = (i, j) -> i - j;
		for(int i : IntStream.range(0, 10).toArray()) {
			assertTrue(BTree.find(tree, intComparator, i));
		}
		
		for(int i : IntStream.range(11, 15).toArray()) {
			assertFalse(BTree.find(tree, intComparator, i));
		}
		
	}

}
