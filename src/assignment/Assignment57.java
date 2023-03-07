/*57.What will be the DAY of current date in next year */
package assignment;

import java.util.Calendar;
import java.util.Date;

public class Assignment57 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.add(Calendar.YEAR, 1); // to get previous year add -1
		Date nextYear = cal.getTime();
		System.out.println(nextYear);
		switch (nextYear.getDay()) {
		case 0:
			System.out.println("It is sunday");
			break;
		case 1:
			System.out.println("It is Monday");
			break;
		case 2:
			System.out.println("It is Tuesday");
			break;
		case 3:
			System.out.println("It is Wednesday");
			break;
		case 4:
			System.out.println("It is Thursay");
			break;
		case 5:
			System.out.println("It is Friday");
			break;
		case 6:
			System.out.println("It is Saturday");
			break;
		
		default:
			System.out.println("Enter correct number!");
			break;
		}
	}

}
