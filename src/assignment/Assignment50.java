/*Given array of string check whether all the elements contains only digits not any alaphabets
if condn satisfied print 1 else -1.
Input:{"123","23.14","522"}
output:1
Input1:{"asd","123","42.20"}
output:-1*/

package assignment;

import java.lang.Character;

public class Assignment50 {	


	public static void main(String[] args) {
		//String[] Input = { "123", "23", "14", "522" };
		String[] Input1 = { "asd", "123", "42.20" };
		Boolean flag = false;
		int num=0;
		for (int j = 0; j < Input1.length; j++) {
			try {
			num=Integer.parseInt(Input1[j]);
			flag=true;
			}
			catch(Exception e)
			{
				flag=false;
				break;
			}
			

		}
		if (flag)
			System.out.println("1");
		else
			System.out.println("-1");

	}

}
