/* Find the average of the maximum and minimum number in an integer array */
package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment32 {

	public static void main(String[] args) {
		int average=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.addAll(List.of(23, 45, 65, 32, 73, 82, 78, 56));
		Collections.sort(al);  
		
		al.forEach(x->{System.out.print(x+" ");}
		);
		System.out.println();
		int amax=Collections.max(al);
		int amin=Collections.min(al);
		System.out.println(amin+" "+amax);
		average=(amax+amin)/2;
		System.out.println("Average "+average);
	}

}
