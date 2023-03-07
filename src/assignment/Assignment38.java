/*38. input1="Rajasthan";
input2=2;
input3=5;
output=hts;
*/
package assignment;

import java.util.Scanner;

public class Assignment38 {

	public static void main(String[] args) {
		//System.out.println("Enter String:");
		Scanner sc=new Scanner(System.in);
		String input1="Rajasthan";//sc.next();           //
		System.out.println("Enter input2: ");
		int input2=sc.nextInt();
		System.out.println("Enter input3: ");
		int input3=sc.nextInt();
		
		
		String rev=" ";			//nahtsajaR
		for(int i=input1.length()-1;i>=0;i--)
		{
			rev=rev+input1.charAt(i);
		}
		System.out.println(rev);
		String output=rev.substring((input2)+1, (input3)+1);
		System.out.println(output);

	}

}
