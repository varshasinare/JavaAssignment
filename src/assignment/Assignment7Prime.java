
/* 3.Find whether given Number is Prime or Not.(You can add this assignment in For-Loop Assignment.) 
 * So that students can implement the logic of finding prime number first and then they can find prime
 *  numbers between 1 and any given number.
 */
package assignment;

import java.util.Scanner;

public class Assignment7Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num;
		num = sc.nextInt();
		boolean flag = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;
				break;

			}

		}
		if (flag) {
			System.out.println("Number is not Prime");
		} else {
			if(num==1)
			{
				System.out.println("Number is not Prime");
			}
			else {
			System.out.println("Number is prime");
			}
		}

	}

}
