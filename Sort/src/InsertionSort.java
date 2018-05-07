package src;

/**
 * Implementation of Insertion sort . Time complexity of O(n^2)
 * @author VAIBHAV
 *
 */
public class InsertionSort {
	
	/**
	 * 
	 * @param array of int
	 */
	public void sort1(int[] arr)
	{
		int n = arr.length;
		for(int i=1;i<=n-1;i++)
		{
			for(int j=i-1;j>=0;j--)
				{
					if(arr[j]>arr[i])
					{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					i--;
					}
				}
		}
	}
	
	public void sort2(int[] arr)
	{
		int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
		
	}
	
}
