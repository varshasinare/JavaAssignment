/*Given an array find the largest 'span'(span is the number of elements between two same digits)
    find their sum.
    a[]={1,4,2,1,4,1,5}
    Largest span=5 */
package assignment;

import java.util.Scanner;

public class Assignment52 {

	public static void main(String[] args) {
		int a[] = { 1, 4, 2, 1, 4,1};
		int n = 0, span = 0,temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					n= j;
				}
			}
			temp= n - i ;
			if (temp> span)
				span = n - i;

		}
		System.out.println(span);

	}
}
