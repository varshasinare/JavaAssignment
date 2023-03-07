/*39. input1=commitment;
  output=cmmitmnt;
c be the first index position 
remove even vowels from the string
*/
package assignment;

public class Assignment39 {

	public static void main(String[] args) {
		String input1="commitment";
		String output="";
		char ch[]=input1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)//odd as c is at index 1
			{
				output=output+ch[i];
			}
			else
			{
				if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				{
					
				}
				else
				{
					output=output+ch[i];
				}
				
				
			}
		}
		System.out.println(output);

	}

}
