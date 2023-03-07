/*Retrieve the elements in a array, which is an input, which are greater than a specific 
 * input number. Add them and find the reverse of the sum. */

package assignment;

import java.util.Scanner;

public class Assignment42 {

	public static void main(String[] args) {
		int a[] = { 23, 46, 65, 32, 73, 82 };
		int b[] = new int[6];
		int j = 0;
		int sum = 0, reverse = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			flag = false;
			if (a[i] > num) {
				b[j] = a[i];
				sum = sum + b[j];
				System.out.print(" " + b[j]);
				j++;
				flag = true;
			}

		}
		if (flag) {

			System.out.println();
			System.out.println("sum: " + sum);

			while (sum != 0) {
				reverse = (reverse * 10) + sum % 10;
				sum = sum / 10;
			}
			System.out.println("reverse :" + reverse);
		}
		else
		{
			System.out.println("No greater number found !");
		}
	}

}
