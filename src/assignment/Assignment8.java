/* 4.A number is given as input. Find the odd digits in the number, add them and find if the sum is
 odd or not.if even * return -1, if odd return 1
input:52315
logic:5+3+1+5=14(even)
output:-1
input:1112
logic:1+1+1=3(odd)
output:1 */

package assignment;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		long num = sc.nextLong();
		int num1 = 0, temp = 0;
		while (num != 0) {
			temp = (int) num % 10;
			num = num / 10;
			if ((temp % 2)!= 0) {
				num1=num1+temp;

			}
		}
		System.out.println(num1);
		if(num1%2==0)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(1);
		}

	}

}
