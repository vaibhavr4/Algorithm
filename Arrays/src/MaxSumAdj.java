package src;
/**
 * Maximum sum such that no two elements are adjacent
 * @author VAIBHAV
 *
 */
public class MaxSumAdj {
	
	public int findMaxSum(int[] arr)
	{
		int n = arr.length;
		int incl = arr[0];
		int excl = 0;
		int newexcl;
		
		for(int i=1;i<n;i++)
		{
			newexcl = (incl>excl)?incl :excl;
			incl = (excl+arr[i]);
			excl = newexcl;
		}
		return ((incl>excl)?incl:excl);
	}
}
