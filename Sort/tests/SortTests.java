package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import src.BubbleSort;
import src.SelectionSort;
import src.InsertionSort;
import src.MergeSort;
import src.QuickSort;
public class SortTests {
	@Test
	public void testSelectionSort() {
		SelectionSort ss = new SelectionSort();
		int[] test = {64,25,12,22,11};
		ss.sort(test);
		int[] result = {11,12,22,25,64};
		assertArrayEquals(test,result);
	}
	
	@Test
	public void testBubbleSort()
	{
		BubbleSort bs = new BubbleSort();
		int[] test = {64,25,12,22,11};
		bs.sort(test);
		int[] result = {11,12,22,25,64};
		assertArrayEquals(test,result);
	}

	@Test
	public void InsertionSort()
	{
		InsertionSort is = new InsertionSort();
		int[] test = {64,25,12,22,11};
		int[] test2 = {3,5,2,4,1,6};
		is.sort1(test);
		is.sort2(test2);
		int[] result1 = {11,12,22,25,64};
		int[] result2 = {1,2,3,4,5,6};
		assertArrayEquals(test,result1);
		assertArrayEquals(test2,result2);
	}
	
	@Test
	public void testMergeSort()
	{
		MergeSort ms = new MergeSort();
		int[] test = {64,25,12,22,11};
		ms.sort(test,0,test.length-1);
		int[] result = {11,12,22,25,64};
		assertArrayEquals(test,result);
	}
	
	@Test
	public void testQuickSort()
	{
		QuickSort ms = new QuickSort();
		int[] test = {64,25,12,22,11};
		ms.sort(test,0,test.length-1);
		int[] result = {11,12,22,25,64};
		assertArrayEquals(test,result);
	}
}
