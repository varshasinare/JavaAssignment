/*A integer array is given as input. find the difference between each element.
 *  Return the index of the largest element which has the largest difference gap.
input: {2,3,4,2,3}
logic: 2-3=1,3-4=1,4-2=2,2-3=1
2 is the max diff between 4 and 2,return the index of 4 i.e 2
output:2*/

package assignment;
public class Assignment10 {

	public static void main(String[] args) {
		int arr[]= {2,3,4,2,3};
		int arr_diff[]=new int[5];
		for(int i=0; i<arr.length-1 ;i++)
		{
			arr_diff[i]=arr[i]-arr[i+1];
			System.out.print("  "+arr_diff[i]);
			
		}
		
		int arr_max=0;
		for(int i=0; i<arr_diff.length-2 ;i++)
		{
			if((arr_diff[i]<arr_diff[i+1])|| (arr_diff[i]==arr_diff[i+1]))
			{
				arr_max=i+1;
			}
			
			else
			{
				
				arr_max=i;
			}
		}
		System.out.println();
		System.out.println("Output :"+arr_max);
		 

	}
	

}
