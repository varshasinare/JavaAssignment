/*Get a input string. Find if it is a negative number, if true return the absolute value, in other cases 
 * return -1.
input: "-123"
output: 123
input: "@123"
output: -1*/
package assignment;

import java.util.Scanner;

public class Assignment27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String s=sc.nextLine();
		try {
		int value =Integer.parseInt(s);
		if(value<0)
		{
			System.out.println(Math.abs(value));
		}
		else 
		{
			System.out.println(value);
		}
		}
		
		catch(Exception e)
		{
			System.out.println(-1);
		}
		
		

	}

}
