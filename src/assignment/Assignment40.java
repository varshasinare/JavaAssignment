/* Retrieve the odd-position digits from input integer array. Multiply them with 
 * their index and return their sum.
 * {1,2,3,4,5,6}
 * 2*1+4*3+6*5=44
*/
package assignment;

import java.util.Scanner;

public class Assignment40 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n= sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(i%2!=0)
			{
				sum=sum+(i*arr[i]);
			}
				
		}
		System.out.println("sum :"+sum);
		

	}

}
