package src;
/**
 * Search an element in a sorted rotated array in O(log n) complexity
 * @author VAIBHAV
 *
 */
public class SearchSortRotated {
	
	public int search(int[] arr,int l, int h,int elem)
	{
		if(l>h)
			return -1;
		int mid = (l+h)/2;
		if(arr[mid]==elem)
			return mid;
		if(arr[l] <= arr[mid])
		{
			if(arr[mid]>=elem && elem>=arr[l])
				return search(arr,l,mid-1,elem);
			return search(arr,mid+1,h,elem);
		}
		
		if(arr[mid]<=elem && elem<=arr[h])
			return search(arr,mid+1,h,elem);
		return search(arr,l,mid-1,elem);
	}

}
