/*46.  intput="xyzwabcd"
    intput2=2;
    input3=4;
    output=bawz*///      dcbawzyx
					//   01234567
package assignment;

public class Assignment46 {

	public static void main(String[] args) {
		String input="xyzwabcd";
		int input1=2;
		int input2=4;
		String output="";
		char ch[]=input.toCharArray();
		String str="";
		for(int i=ch.length-1;i>=0;i--)
		{
		 str=str+String.valueOf(ch[i]);
		}
		output=str.substring(input1, input1+input2);
		System.out.println(output);
	}

}
