/*19. accept a string and find if it is of date format "dd/mm/yyyy".
input:01/13/2012
output:false*/
package assignment;

import java.util.Scanner;

public class Assignment19 {

	public static void main(String[] args) {
		System.out.println("Enter in dd/mm/yyyy format");
		Scanner sc = new Scanner(System.in);
		String input=sc.next();
		int day=Integer.parseInt(input.substring(0, 2));
		int month=Integer.parseInt(input.substring(3, 5));
		int year=Integer.parseInt(input.substring(6, 10));
		if(day<=31 && month<=12)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
