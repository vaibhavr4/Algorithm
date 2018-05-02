package tests;
import src.BinarySearch;
import src.JumpSearch;
import src.LinearSearch;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Junit tests to exercise the search strategies
 * @author VAIBHAV
 *
 */
public class SearchTests {

	@Test
	public void linearSearchTests() {
		LinearSearch ls = new LinearSearch();
		int[] testarray = new int[] {12,2,3,4,1};
		assertEquals(ls.search(testarray,3),3);
		assertEquals(ls.search(testarray, 5),-1);
		
	}
	
	@Test
	public void binarySearchTests() {
		BinarySearch bs = new BinarySearch();
		int[] testarray = new int[] {2,3,4,10,40,50};
		assertEquals(bs.searchRecursive(testarray,0,testarray.length-1,4),3);
		assertEquals(bs.searchRecursive(testarray,0,testarray.length-1,12),-1);
		assertEquals(bs.searchIterative(testarray,4),3);
		assertEquals(bs.searchIterative(testarray,12),-1);
	}
	
	@Test
	public void jumpSearchTests() {
		JumpSearch js = new JumpSearch();
		int[] testarray = new int[] {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
		assertEquals(js.search(testarray,55),10);
		assertEquals(js.search(testarray,8),6);
		assertEquals(js.search(testarray, 10),-1);
	}
	
	@Test
	public void interpolationSearchTests() {
		JumpSearch js = new JumpSearch();
		int[] testarray = new int[] {10, 12, 13, 16, 18, 19, 20, 21, 22, 23,24, 33, 35, 42, 47};
		assertEquals(js.search(testarray,12),1);
		assertEquals(js.search(testarray,47),14);
		assertEquals(js.search(testarray, 9),-1);
	}

}
