package src;
/**
 * to do a simple linear search
 * @author VAIBHAV
 *
 */

public class LinearSearch {
    
	/**
	 * to return position of array given an element to search
	 * @param arr
	 * @param element
	 * @return
	 */
    public int search(int[] arr, int element)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==element)
            {
                return i+1;
            }
        }
        return -1;
    }
}
