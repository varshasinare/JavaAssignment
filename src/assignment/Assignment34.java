//find the three consecutive characters in a string. if the string consists any three 
//   consecutive characters return 1 else return -1      like AAAxyzaaa will return true.
package assignment;

import java.util.Scanner;

public class Assignment34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.next();
		char[] ch=s.toCharArray();
		boolean flag=false;
		int count=1;
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				count++;
				if(count>=3)
				{
					flag=true;
					break;
				}
			}
			else
			{
				count=1;
			}
		}
		if(flag)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(-1);
		}
		
		

	}

}
