/*13. Given date in dd-MM-yyyy format.return the month in full name format(January)
input:"23-01-2012"
output:January*/
package assignment;

import java.util.Calendar;
import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		System.out.println("Enter in dd-MM-yyyy format");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		if(month<=12 && day<=31)
		{
				Calendar c = Calendar.getInstance();
				c.set(year,month - 1,day);
				//System.out.println(c.get(Calendar.MONTH));
				String dayOfWeek = getMonth(c.get(Calendar.MONTH)+1);//january=0
				System.out.println(dayOfWeek);
		}
		else 
		{
			System.out.println(" Invalid date");
		}
	}
	static String getMonth(int value){
	    String Month = "";
	    switch(value){
	    case 1:
	    	Month="January";
	        break;
	    case 2:
	    	Month="February";
	        break;
	    case 3:
	    	Month="March";
	        break;
	    case 4:
	    	Month="April";
	        break;
	    case 5:
	    	Month="May";
	        break;
	    case 6:
	    	Month="June";
	        break;
	    case 7:
	    	Month="Jully";
	        break;
	    case 8:
	    	Month="August";
	        break;
	    case 9:
	    	Month="September";
	        break;
	    case 10:
	    	Month="October";
	        break;
	    case 11:
	    	Month="November";
	        break;
	    case 12:
	    	Month="December";
	        break;
	    }
	    return Month;
	    }  

	

}
