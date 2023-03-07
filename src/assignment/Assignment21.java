/*.  Find the extension of a given string file.
input: "hello.jpeg"
output: "jpeg"  */
package assignment;

import java.util.Scanner;

public class Assignment21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter file name :");
		// String s=sc.nextLine();

		String s = "hello.jpeg";
		String[] s2 = s.split("\\.");

		System.out.println(s2[1]);

	}

}
