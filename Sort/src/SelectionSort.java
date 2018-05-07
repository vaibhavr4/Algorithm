package src;
/**
 * Java program for selection sort with time complexity of O(n^2)
 * @author VAIBHAV
 *
 */
public class SelectionSort {

	/**
	 * 
	 * @param arr
	 */
	public void sort(int arr[])
	{
		int n= arr.length;
		for(int i=0; i<n-1;i++)
		{
			int min_indx=i;
			for(int j=i+1; j<n;j++)
			{
				if(arr[j]<arr[min_indx])
					min_indx=j;
			}
			int temp = arr[min_indx];
			arr[min_indx] = arr[i];
			arr[i]=temp;
		}
		
	}
}
