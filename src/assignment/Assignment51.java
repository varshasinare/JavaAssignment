/*nt[] a={12,14,2,26,35}
find the difference b/w max and min values in array
output:35-2=33.*/

package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment51 {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.addAll(List.of(12,14,2,26,35));
		int amax=Collections.max(al);
		int amin=Collections.min(al);
		System.out.println("max val is :"+ amax +" min val is:"+amin);
		System.out.println("Diff is : " +(amax-amin));
	}

}
