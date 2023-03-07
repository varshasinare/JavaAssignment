/*input={"1","2","3","4"}
    output=10
ie,if string elements are nos,add it.
    input={"a","b"}
    output=-1; */

package assignment;

public class Assignment53 {

	public static void main(String[] args) {
		String input[] = { "1", "2", "3", "4" };
		String input1[] = {"a","b"};
		
		int num=0,sum=0;
		boolean flag=false;

		for (int i = 0; i < input.length; i++)
		{
			try {
			num=Integer.parseInt(input[i]);
			sum=sum+num;
			flag=true;
			}
			catch(NumberFormatException e) {
				
				flag=false;
			}

		}
		if(!flag)
		{
			System.out.println("Output :"+ -1);
		}
		else
		{
			System.out.println("Output :"+ sum);
		}

	}

}
