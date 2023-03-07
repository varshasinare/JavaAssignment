/*9.Find the day(Friday) of a date input given as MM-dd-yyyy (format)
input:12-27-2012
output:Thursday
*/

package assignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		System.out.println("Enter in MM-dd-yyyy format");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		int year = sc.nextInt();
		if(month<=12 && day<=31)
		{
				Calendar c = Calendar.getInstance();
				c.set(year,month - 1,day);
				String dayOfWeek = getDayOfWeek(c.get(Calendar.DAY_OF_WEEK));
				System.out.println(dayOfWeek);
		}
		else {
			System.out.println(" Invalid date");
		}
	}
	
	 static String getDayOfWeek(int value){
	    String day = "";
	    switch(value){
	    case 1:
	        day="Sunday";
	        break;
	    case 2:
	        day="Monday";
	        break;
	    case 3:
	        day="Tuesday";
	        break;
	    case 4:
	        day="Wednesday";
	        break;
	    case 5:
	        day="Thursday";
	        break;
	    case 6:
	        day="Friday";
	        break;
	    case 7:
	        day="Saturday";
	        break;
	    }
	    return day;
	    }    
	

}
