
//6 Search given number in an array. If number is present in an array then print number and array index of that no.
//If not, print "Element not found" message.
//e.g Array={12,56,67,98}

package assignment;

import java.util.*;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = sc.nextInt();
		int Array[] = { 12, 56, 67, 98 };
		for (int i = 0; i < Array.length; i++) {
			if (num == Array[i]) {
				System.out.println(num + " index is" + i);
				break;
			} else {
				System.out.println("Element not found");
				break;
			}
		}

	}

}
