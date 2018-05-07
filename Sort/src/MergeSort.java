package src;

public class MergeSort {
	
	public void sort(int[] arr,int l,int r)
	{
		int m = (l+r)/2;
		if(l<r)
		{
			// split the array into two
		 sort(arr,l,m);
		 sort(arr,m+1,r);
		
		 //merge the split arrays	
		 merge(arr,l,m,r);
		}
	}
	
	public void merge(int[] arr, int l ,int m, int r)
	{
		// initialize length of two arrays to be merged
		int n1= m-l+1;
		int n2 = r-m;
		
		int[] Larray = new int[n1];
		int[] Rarray = new int[n2];
		
		// copy the arrays of the split left and right arrays
		
		for(int i=0; i<n1;i++)
			Larray[i] = arr[l+i];
		for(int j=0;j<n2;j++)
			Rarray[j] = arr[m+1+j];	
		
		//merge the two initialized split arrays
		
		int i=0; int j=0;   // initialize the index of left and right array
		
		int k=l;  // initialize the initial index of merged array
		
		while(i<n1 && j<n2)
		{	
			if(Larray[i] <= Rarray[j])
			{
					arr[k] = Larray[i];
					i++;
			}
			
			else
			{
				arr[k] = Rarray[j];
				j++;
			}
			k++;
		}
		
		/* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = Larray[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = Rarray[j];
            j++;
            k++;
        }
		
	}

}
