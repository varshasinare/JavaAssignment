/*validate the ip address in the form a.b.c.d where a,b,c,d must be between 0and 255
   if validated return 1 else return 2 */

package assignment;

import java.util.Scanner;

public class Assignment33 {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter IP address :");
		
		String s= "100.256.150.100";//sc.next();
		String[] split=s.split("\\.");
		boolean flag=false;
		for(int i=0;i<split.length;i++)
		{
			int a=Integer.parseInt(split[i]);
			if((a>=0) && (a<=255))
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
				
			}
		}
		if(flag)
		{
			System.out.println("1");
		}
		else {
			System.out.println("2");
			
		}

		
		
	}

}
