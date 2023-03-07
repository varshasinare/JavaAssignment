/*63.no of days in a month in specific year
*/
package assignment;

import java.util.Calendar;
import java.util.Scanner;

public class Assignment63 {

	public static void main(String[] args) {
		System.out.println("Enter in Number format");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		 switch(month){
		    case 1:
		    	System.out.println("31 Days in January");
		        break;
		    case 2:
		    	System.out.println("28/29 Days in February");
		        break;
		    case 3:
		    	System.out.println("31 Days in March");
		        break;
		    case 4:
		    	System.out.println("30 Days in April");
		        break;
		    case 5:
		    	System.out.println("31 Days in May");
		        break;
		    case 6:
		    	System.out.println("30 Days in June");
		        break;
		    case 7:
		    	System.out.println("31 Days in Jully");
		        break;
		    case 8:
		    	System.out.println("31 Days in August");
		        break;
		    case 9:
		    	System.out.println("30 Days in September");
		        break;
		    case 10:
		    	System.out.println("31 Days in October");
		        break;
		    case 11:
		    	System.out.println("30 Days in November");
		        break;
		    case 12:
		    	System.out.println("31 Days in December");
		        break;

	}
	}
}


