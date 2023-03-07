/* 5.Sum of fibonaaci series upto given input.
sum of first 3 
logic:1+1+2+3+5
output:4*/

package assignment;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Input:");
		int input=sc.nextInt();
		int num=0;
		int num1=1;
		int result=0,sum=0;
		//System.out.print(num+"");
		for(int i=1;i<6;i++)
		{
			result=num+num1;
			num1=num;
			num=result;
		
		System.out.print(" "+result);
		if(i<=input)
		{
		sum=sum+result;
		}
		
		}
		System.out.println();
		System.out.println("sum: "+sum);

	}

}
