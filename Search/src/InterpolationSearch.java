package src;

public class InterpolationSearch {
	
	public int search(int[] arr,int elem)
	{
		int lo=0;
		int hi = arr.length-1;
		while(lo<=hi && elem>=arr[lo] && elem<=arr[hi])
		{
		int pos = lo+(((hi-lo)/(arr[hi]-arr[lo]))*(elem-arr[lo]));
		if(arr[pos]==elem)
			return pos;
		else if(arr[pos]<elem)
			lo=pos+1;
		else
			hi=pos-1;
		}
		return -1;
	}

}
