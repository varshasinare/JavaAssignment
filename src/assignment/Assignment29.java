//Enter your name and return a string "print the title first and then comma and then first letter of initial
//name.
package assignment;

import java.util.Scanner;

public class Assignment29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name :");
		String name=sc.nextLine();
		int n=name.length();
		String[] split_name=name.split(" ");
		System.out.println(split_name[0]+","+split_name[1].charAt(0));
		
		
		
//		for(String i:split_name)
//		{
//			System.out.println(i);
//		}
		
	}

}
