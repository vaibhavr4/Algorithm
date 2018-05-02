package src;
/**
 * @author VAIBHAV
 * binary search works only on sorted arrays
 */

public class BinarySearch {
	
	/**
	 * to search for an element by recursively calling the same function
	 * @param arr
	 * @param first
	 * @param last
	 * @param elem
	 * @return
	 */
	public int searchRecursive(int[] arr,int first,int last,int elem)
	{
		if(last>=first)
		{
		int mid = first + (last-first)/2;
		if(arr[mid]==elem)
			return mid+1;
		if(arr[mid]>elem)
			return searchRecursive(arr,first,mid-1,elem);
		return searchRecursive(arr,mid+1,last,elem);
		}
		return -1;
	}
	
	/**
	 * to return the position of an element in array by using iterative approach
	 * @param arr
	 * @param elem
	 * @return
	 */
	public int searchIterative(int[] arr,int elem)
	{
		int first = 0;
		int last = arr.length-1;
		while(last>=first)
		{
			int mid = first + (last-first)/2;
			if(arr[mid] == elem)
				return mid+1;
			else if(elem > arr[mid])
				first = mid+1;
			else
				last = mid-1;
		}
		return -1;
	}
	

}
