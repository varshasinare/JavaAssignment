
/*2.Take input of two  numbers from user and take one operator(+,-,*,/) as a input from user and do manipulations 
    according to operator and display result on console.(Switch Case)
    Ex: Enter first no:20
    Enter second no:30
    Enter operator:'*'
    O/p: The multiplication of two no.s is: 600 */
package assignment;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number :");
		int num1 = sc.nextInt();

		System.out.print("Enter the Second number :");
		int num2 = sc.nextInt();

		System.out.print("Enter the operator :");
		char op = sc.next().charAt(0);
		double result=0;

		switch (op) {
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(result);
			break;

		default:
			break;

		}

	}

}
