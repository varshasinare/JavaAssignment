/*1.Write a program to display Day of the week using Switch case
    Ex: Day=3 then display 'Wednesday'*/

package assignment;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("It is Monday");
			break;
		case 2:
			System.out.println("It is Tuesday");
			break;
		case 3:
			System.out.println("It is Wednesday");
			break;
		case 4:
			System.out.println("It is Thursay");
			break;
		case 5:
			System.out.println("It is Friday");
			break;
		case 6:
			System.out.println("It is Saturday");
			break;
		case 7:
			System.out.println("It is sunday");
			break;
		default:
			System.out.println("Enter correct number!");
			break;
		}
	}

}
