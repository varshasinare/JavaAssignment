/*43. compare two strings, if the characters in string 1 are present in
   string 2, then it should be put as such in output, else '+' should be
   put in output...ignore case difference.
    input 1:"New York"
    input 2:"NWYR"
    output:N+w+Y+r+*/
package assignment;

public class Assignment43 {

	public static void main(String[] args) {
		String input1="New York";
		String input2="NWYR";
		String string1=input1.toUpperCase();
		String string2=input2.toUpperCase();
		String output="";
		
		for(int i=0;i<string1.length();i++)
		{
			boolean flag=false;
			for(int j=0;j<string2.length();j++)
			{
				flag=false;
				if(string1.charAt(i)==string2.charAt(j))
				{
					output=output+input1.charAt(i);
					break;
					
				}
				else 
				{
					flag=true;
					
				}
			}
			if(flag)
				output=output+'+';
		}
		System.out.println(output);

	}

}
