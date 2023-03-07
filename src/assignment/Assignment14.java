/*14. Two dates are given as input in "yyyy-MM-dd" format. Find the number of months between the two dates
input1:"2012-12-01"
input2:"2012-01-03"
output:11*/
package assignment;

import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Years;

public class Assignment14 {
	LocalDate input1 = new LocalDate(2012,12,01);
	LocalDate input2 = new LocalDate(2012,01,03); 
	int monthsBetween = Months.monthsBetween(input1, input1).getMonths();
	//int yearsBetween = Years.yearsBetween(input1, input2).getYears();
	

}
