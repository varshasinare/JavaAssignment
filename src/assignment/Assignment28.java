/* 28 Find the number of days between two input dates.;
 * */
 package assignment;

import java.util.Calendar;
import java.util.Date;

public class Assignment28 {

	public static void main(String[] args) {
		Calendar cal1=Calendar.getInstance();
		cal1.set(2022, 0, 1);			//int year, int month, int date
		Date t1=cal1.getTime();
		
		
		Calendar cal2=Calendar.getInstance();
		cal1.set(2022, 3, 1);			//int year, int month, int date
		Date t2=cal1.getTime();
		
		long days=Math.abs((t1.getTime()-t2.getTime())/86400000);  //minisec in day
		System.out.println(days);
		}
	

}
