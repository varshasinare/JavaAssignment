/*35. String encryption. replace the odd-index character with next character(if it is 'z' replace with 'a'..if 'a' with 'b' as such), 
leave the even index as such. return the encrypted string.
*/
package assignment;

import java.util.Scanner;

public class Assignment35 {
	public static void main(String[] args) {
		System.out.println("Enter string:");		//Varsha    Vbrthb
		Scanner sc= new Scanner(System.in);
		String input=sc.next();
		char ch[]=input.toCharArray();
		int val=0;
		String s1="";
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)		//even
			{
				 s1=s1+ch[i];
			}
			else 			//odd
			{
				 val=ch[i]+1;
			     char c=(char)val;
			     s1=s1+c;
			}			
		}
		 
		  System.out.println(s1);

	}

}
