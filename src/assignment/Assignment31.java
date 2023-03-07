//    validate a password 
//i) there should be atleast one digit				
//ii) there should be atleast one of '#','@' or '$' .   
//iii)the password should be of 6 to 20 characters		
//iv) there should be more uppercase letter than lower case.		/ Invalid/SAC12@acds   
//v) should start with an upper case and end with lower case		/Valid/VARSha@123h
//
package assignment;

import java.util.Scanner;

public class Assignment31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password : ");
		String pwd = sc.next();
		//String.
		char[] ch = pwd.toCharArray();
		boolean digit_flag = false;
		boolean SpecialChar_flag = false;
		boolean firstchar_upperC=Character.isUpperCase(ch[0]);
		boolean lastchar_lowerC=Character.isLowerCase(ch[(ch.length)-1]);
		int upperCase_count = 0;
		int lowerCase_count = 0;
		
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i] >= '0') && (ch[i] <= '9')) {
				digit_flag = true;
			}
			if ((ch[i] == '#') || (ch[i] == '@') || (ch[i] == '$')) {
				SpecialChar_flag = true;
			}
			if (Character.isUpperCase(ch[i])) {
				upperCase_count++;
			}
			if((Character.isLowerCase(ch[i]))) {
				lowerCase_count++;
			}
		}
		if ((digit_flag == true) && (SpecialChar_flag) && ((ch.length >= 6)&&(ch.length <=20))
				&& (upperCase_count > lowerCase_count) && firstchar_upperC &&  lastchar_lowerC ) 
		{
			System.out.println("It is valid Password ");
		}
		else
		{
			System.out.println("It is not valid Password ");
		}

	}

}
