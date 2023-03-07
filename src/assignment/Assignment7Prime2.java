package assignment;

import java.util.Scanner;

public class Assignment7Prime2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		boolean flag=false;
		for(int i=2; i<=num; i++)
		{
			flag=false;
			for(int j=2; j<i; j++) 
			{
				if(i%j==0)
				{
					flag=true;
				}
				
			}
			
			if(!flag)
			{
				System.out.print(i+" " );
				
			}
			
			
		}

	}

}
