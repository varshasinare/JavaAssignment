/*58.Get all the numbers alone from the string and return the sum.
Input"123gif"
Output:6
*/
package assignment;

import java.util.Scanner;

public class Assignment58 {

	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char ch[]=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
				if(Character.isDigit(ch[i]))
				{
					String t=String.valueOf(ch[i]);
					sum=sum+Integer.parseInt(t);
				}
				
		}	
		System.out.println(sum);
	}

}
