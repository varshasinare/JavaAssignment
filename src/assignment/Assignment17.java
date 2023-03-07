/*Get a input string. reverse it and parse it with '-'.
input:computer
output:r-e-t-u-p-m-o-c*/

package assignment;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.next();
		String reverse = "";
		int x = s.length();
		char[] rev_s = new char[2 * s.length()];
		int j = 0;

		for (int i = x - 1; i >= 0; i--) {

			reverse = reverse + s.charAt(i);
		}
		for (int i = 0; i < x; i++) {
			char temp = reverse.charAt(i);
			if (temp == ' ') {
				break;
			} else {
				rev_s[j] = reverse.charAt(i);
				j++;
				rev_s[j] = '-';
				j++;
			}

		}
		for (int i = 0; i < rev_s.length - 1; i++) {
			System.out.print(rev_s[i]);

		}

	}

}
