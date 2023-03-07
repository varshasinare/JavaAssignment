/*55.count the number of times the second word in second string occurs in first string-case sensitive
input1=hai hello hai where hai Hai;
input2=what hai
output=3;*/
package assignment;

public class Assignment55 {

	public static void main(String[] args) {
		String input1="hai hello hai where hai  hai Hai";
		String input2="what hai";
		String str[]=input1.split(" ");
		String str2[]=input2.split(" ");
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if(str2[1].equals(str[i]))
			{
				count++;
				
			}
		}
		System.out.println(count);
		
	}

}
