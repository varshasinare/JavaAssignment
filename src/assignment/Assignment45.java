/*45.Return  months between two dates
 * */
package assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Assignment45 {

	public static void main(String[] args) throws ParseException {
		String s1="02/01/2022";
		String s2="02/12/2023";
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Calendar cal = Calendar.getInstance();
		 
         Date d1 = sdf.parse(s1);
         cal.setTime(d1);
         int months1 = cal.get(Calendar.MONTH);
         int year1 = cal.get(Calendar.YEAR);
         
         Date d2 = sdf.parse(s2);
         cal.setTime(d2);
         int months2 = cal.get(Calendar.MONTH);
         int year2 = cal.get(Calendar.YEAR);
         int n = ((year2-year1)*12)+(months2-months1);
         System.out.println(n);

	}

}
