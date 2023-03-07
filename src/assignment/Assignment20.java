
/*Get a integer array as input. Find the average of the elements which are in the position of prime index
input:{1,2,3,4,5,6,7,8,9,10}
      {0,1,2,3,4,5,6,7,8, 9}
           2,3,  5    7
logic:     3+4+  6+  8(the indeces are prime numbers)
output:21*/
package assignment;

public class Assignment20 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };//3,4,6,8
		int sum = 0;
		float average = 0;
		int count = 0;
		for (int i = 2; i < (arr.length); i++) 		// for arr index
		{
			boolean flag=false;
			for (int j = 2; j < i; j++) 			// for prime index
			{
				if (i % j == 0) {
					flag = true;
					break;
			}
			}
			if(!flag)
			{
				sum=sum+arr[i];
				
			}
			

		}
		
		System.out.println("Sum is: " + sum);

	}

}
