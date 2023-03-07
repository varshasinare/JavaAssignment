/*   Find no of characters in a given string which are not repeated.
input: "hello"
output: 3*/
package assignment;

import java.util.Scanner;

public class Assignment26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String String1 = sc.nextLine();

		String New_String = String1.toLowerCase();
		int length = New_String.length();
														// String1.toCharArray();
		int x = 1; 																// hello,string,session
		char n[] = new char[length];

		for (int i = 0; i < length; i++) {
			n[i] = New_String.charAt(i);

		}
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (n[i] == n[j]) {
					x++;
				} else {

				}
			}
		}
		System.out.println("Output : " + (length - (x))); // will not work for palindrom string;

	}

}
