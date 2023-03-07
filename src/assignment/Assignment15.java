/*15. A time input is received as string. Find if the hour format is in 12 hour format. the suffix am/pm is case insensitive.
input:"09:36 am" 12:56 am
output:true*/
package assignment;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		
	System.out.println("Enter time:");
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	if(input.contains("am")||input.contains("pm")||input.contains("AM")||input.contains("PM"))
	{
		
		String input1[]=input.split(":");//hrs
		String input2[]=input1[1].split(" ");	//min am/pm
		int hrs=Integer.parseInt(input1[0]);
		int min=Integer.parseInt(input2[0]);
		if(hrs<=12 && min<=59)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
	}
	else
	{
		System.out.println("False");
	}
	
	
	}

}
