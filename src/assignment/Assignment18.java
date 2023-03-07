/* Two input strings are accepted. If the two strings are of same length concat them and 
 * return, if they are not of same length, reduce the longer string to size of smaller one,
 *  and concat them
input1:"hello"
input2:"hi" 
output:"lohi"
*/
package assignment;

import java.util.Scanner;

public class Assignment18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter 2nd String: ");
		String s2 = sc.nextLine();
		String s="";
		String new_s="";
		int length=0;
		if (s1.length() == s2.length()) {
			new_s=s1.concat(s2);
		} 
		else if (s1.length() > s2.length()) {
			length=s1.length() - s2.length();
			s=s1.substring(length);
			new_s=s.concat(s2);
		}
		else// s1.length() < s2.length()
		{
			length=s2.length() - s1.length();
			s=s2.substring(length);
			new_s=s.concat(s1);
		}
		System.out.println(new_s);

	}

}
