/*66.Email Validation
   String input1="test@gmail.com"
                1)@ & . should be present;
                2)@ & . should not be repeated;
                3)there should be five charcters between @ and .;
                4)there should be atleast 3 characters before @ ;
                5)the end of mail id should be .com;
*/
package assignment;

import java.util.Scanner;

public class Assignment66 {

	public static void main(String[] args) {
		System.out.println("Enter Email-ID :");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();

		char c[] = email.toCharArray();
		int x = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '@' || c[i] == '.') {
				x++;
			}
		}

		String s[] = email.split("@"); // test gmail.com
		String s1[] = s[1].split("\\."); // gmail .com
		if (email.contains("@") && email.contains(".")) {
			if (s1[0].length() == 5) {
				if (s[0].length() >= 3) {
					if (s1[1].equals("com")) {
						if (!(x > 2)) // char repeated
						{
							System.out.println("Valid Email ID");
						}
						else
						{
							System.out.println("Invalid Email ID");
						}

					}
					else
					{
						System.out.println("Invalid Email ID");
					}
					
				}
				else
				{
					System.out.println("Invalid Email ID");
				}
			}
			else
			{
				System.out.println("Invalid Email ID");
			}
		}
		else
		{
			System.out.println("Invalid Email ID");
		}
		
	}

}
