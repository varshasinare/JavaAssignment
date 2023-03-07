/*67.Square root calculation of
   ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))      1 2 3 1=5
   o/p should be rounded of to int;			3 6 4 1 = 98 9
*/
package assignment;

import java.util.Scanner;

public class Assignment67 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value x1,y1,x2,y2 resp ");
		 double x1=sc.nextLong();
		 double y1=sc.nextLong();
		 double x2=sc.nextLong();
		 double y2=sc.nextLong();
		 double output=0;

		 output = Math.sqrt((Math.pow(x1 + x2, 2)) + (Math.pow(y2 + y1, 2)));
		 int out=(int) (output);
		 System.out.println(out);

	}

}
