/*.Given two arrayslist. retrieve the odd position elements form first input and even position elemetns from second list. 
put it into the new arraylist at the same positions from where they are retrieved from.
(consider 0th position as even position, and two lists are of same size)
input1:{12,1,32,3}
input2:{0,12,2,23}
output:{0,1,2,3}
*/
package assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment11 {
	public static void main(String args[]) {
		ArrayList<Integer> Alist = new ArrayList<Integer>();
		Alist.addAll(List.of(12, 1, 32, 3));
		ArrayList<Integer> Blist = new ArrayList<Integer>();
		Blist.addAll(List.of(0, 12, 2, 23));

		// ArrayList<Integer> Odd_list= new ArrayList<Integer>();
		// ArrayList<Integer> Even_list= new ArrayList<Integer>();

		ArrayList<Integer> Final_list = new ArrayList<Integer>();

		for (int i = 0; i < Alist.size(); i++) {
			if (i % 2 != 0) {
				// Odd_list.add(Alist.get(i));
				Final_list.add(Alist.get(i));
			} else {
				// Even_list.add(Blist.get(i));
				Final_list.add(Blist.get(i));

			}
		}

		/*
		 * Even_list.forEach(x->{ System.out.print(x+" "); });
		 * 
		 * System.out.println();
		 * 
		 * Odd_list.forEach(x->{ System.out.print(x+" "); }); System.out.println();
		 */

		Final_list.forEach(x -> {
			System.out.print(x + " ");
		});

	}

}
