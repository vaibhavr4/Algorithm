package src;
/**
 * jump search where the basic idea is to check fewer elements 
 * by jumping ahead by fixed steps and then performing linear search
 * @author VAIBHAV
 *
 */
public class JumpSearch {
	
	/**
	 * function to perform jump search
	 * @param arr
	 * @param elem
	 * @return
	 */
	public int search(int[] arr, int elem)
	{
		int size = arr.length;
		int start=0;
		int step_size = (int)Math.floor(Math.sqrt(size));
		while(arr[Math.min(size, step_size)-1]<elem)
		{
			start = step_size;
			step_size += step_size;
			if(start>=step_size)
				return -1;
		}
		
		while(arr[start]<elem)
		{
			start++;
			if(start == Math.min(step_size, size))
				return -1;
			else if(arr[start]==elem)
				return start;
		}
		return -1;
	}

}
