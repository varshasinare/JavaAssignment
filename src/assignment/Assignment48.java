/*input1="abc2012345"
  input2="abc2112660"
  input 3=4
here "abc**" refers to customer id.
12345 refers to last month eb reading and 12660 refers to this month eb reading
find the difference between two readings and multiply it by input 3
ie., output=(12660-12345)*4*/

package assignment;

import java.util.Scanner;

public class Assignment48 {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Input 1:");
		String s1= "abc2012345";
		//System.out.println("Input 2:");
		String s2= "abc2112660";
		//System.out.println("Input 3:");
		int Input3= 3;
		
		
		int Input1=Integer.parseInt(s1.substring(3));
		int Input2=Integer.parseInt(s2.substring(3));
		
		int output=(Input2-Input1)*Input3;
	     System.out.println(output);
	     
	
	}

}
