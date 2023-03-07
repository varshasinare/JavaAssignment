/*Given an array int a[]. Add the sum at even indexes.do the same with odd indexes.
    if both the sum is equal return 1 or return -1.     (1,2,4,3)
*/
package assignment;

import java.util.Scanner;

public class Assignment62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int even_sum = 0, odd_sum = 0;
		System.out.println("Enter elements of an Array :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (i % 2 == 0) {
				even_sum = even_sum + arr[i];
			} else {
				odd_sum = odd_sum + arr[i];
			}
		}
		if (even_sum == odd_sum) {
			System.out.println(1);
		} else {
			System.out.println(-1);
		}

	}

}
