package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import src.ArrayRotate;
import src.MaxSumAdj;
import src.SearchSortRotated;

public class ArrayTests {

	@Test
	public void testArrayRotate()
	{
		ArrayRotate ar = new ArrayRotate();
		int[] test = new int[] {1,2,3,4,5};
		int[] out = ar.rotate(test,2);
		int[] expect = new int[] {3,4,5,1,2};
		assertArrayEquals(out, expect);
	}
	
	@Test
	public void testMaxSumAdj()
	{
		MaxSumAdj ms = new MaxSumAdj();
		int[] arr1 = {5, 5, 10, 100, 10, 5};
		int[] arr2 = {1, 2, 3};
		int[] arr3 = {1, 20, 3};
		assertEquals(ms.findMaxSum(arr1),110);
		assertEquals(ms.findMaxSum(arr2),4);
		assertEquals(ms.findMaxSum(arr3), 20);
	}
	
	@Test
	public void testSearchSortRotated()
	{
		SearchSortRotated sr = new SearchSortRotated();
		int[] arr1 = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int[] arr3 = {30, 40, 50, 10, 20};
		assertEquals(sr.search(arr1, 0, 8, 3),8);
		assertEquals(sr.search(arr1, 0, 8, 30),-1);
		assertEquals(sr.search(arr3, 0, 4, 10),3);
	}

}
