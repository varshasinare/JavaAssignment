/*6.  Check whether a given string is palindrome also check whether it has atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)*/

package assignment;

import java.util.Scanner;

public class Assignment25 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String temp1 = sc.nextLine();
		String temp = temp1.toLowerCase();
		String Reverse_String = "";

		char n[] = new char[temp.length()];
		int j = 0;
		for (int i = temp.length() - 1; i >= 0; i--) {
			Reverse_String = Reverse_String + temp.charAt(i);

		}

		if (temp.equals(Reverse_String)) {
			System.out.println("String is Palindrom");

			for (int i = 0; i <= temp.length() - 1; i++) {
				if (temp.charAt(i) == 'a') {
					n[j] = 'a';
					j++;
				} else if (temp.charAt(i) == 'e') {
					n[j] = 'e';
					j++;
				} else if (temp.charAt(i) == 'i') {
					n[j] = 'i';
					j++;
				} else if (temp.charAt(i) == 'o') {
					n[j] = 'o';
					j++;
				} else if (temp.charAt(i) == 'u') {
					n[j] = 'u';
					j++;
				}

			}
			// char x=n[0];
			boolean flag = false;
			for (int i = 1; i <= j - 1; i++) {
				if (n[0] == n[i]) {
					flag = true;

				} else {
					flag = false;
					break;
				}

			}
			if (flag) {
				System.out.println("same vovels");
			} else {
				System.out.println("Vovels are different"); // will not work for Dad ,Mom
			}
		}

		else {
			System.out.println("String is not Palindrom");
		}

	}

}