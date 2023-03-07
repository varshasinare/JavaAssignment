/*arraylist1={ 1,2,3,4,5}
  arraylist2={ 6,7,8,9,10}
size of both list should be same 
output={6,2,8,4,10}*/

package assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment54 {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		ArrayList<Integer> outputlist = new ArrayList<Integer>();
		arraylist1.addAll(List.of(1, 2, 3, 4, 5));
		arraylist2.addAll(List.of(6, 7, 8, 9, 10));

		if (arraylist1.size() == arraylist2.size()) {
			for (int i = 0; i < arraylist1.size(); i++) {

				if (i % 2 != 0) {
					
					outputlist.add(arraylist1.get(i));
				} else {
					
					outputlist.add(arraylist2.get(i));

				}
			}

			outputlist.forEach(x -> {
				System.out.print(" " + x);
			});
		}

	}

}
