/*56. find the no.of charcters,that has repeated 3 consecutive times
input1:"aaabbccc"
ouput1=2;
*/
package assignment;

public class Assignment56 {

	public static void main(String[] args) {
		String s1="aaabbbccc";
		
		int a=0;
        int c=0;
        for(int i=0;i < s1.length()-1;i++)
        {
              if((s1.charAt(i+1)-s1.charAt(i))==0)
              {
                    c++;
              }
              if(c>=2)
              {
            	  c=0;
            	  a++;
              }
              
        }
        System.out.println(a+"  no of charcters,that has repeated ");
             
	}

}
