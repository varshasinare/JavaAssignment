/*64.Find the sum of the numbers in the given input string array
   Input{“2AA”,”12”,”ABC”,”c1a”)
   Output:6 (2+1+2+1)
   Note in the above array 12 must not considered as such
   i.e,it must be considered as 1,2*/
package assignment;

public class Assignment64 {

	public static void main(String[] args) {
	String input[]= {"2AA", "12", "ABC", "c1a"};
	int sum=0;
	String s="";
	for(int i=0;i<input.length;i++)
	{
	 s=input[i];
	 for(int j=0;j<s.length();j++)
	 {
	 char c=s.charAt(j);
	 if(Character.isDigit(c))
	 {
	 String t=String.valueOf(c);
	 int n=Integer.parseInt(t);
	 sum=sum+n; 
	 }
	 
	 }
	}
	System.out.println(sum); 

	}

}
