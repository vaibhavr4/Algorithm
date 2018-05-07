package src;
/**
 * Implementation not bubble sort; Worst case time complexity -> O(n^2) ; Best case -> O(n)
 * @author VAIBHAV
 *
 */
public class BubbleSort {
	
	public void sort(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0; j<n-i-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
