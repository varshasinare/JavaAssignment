/*59. String a="a very fine day"
output:A Very Fine Day
*/
package assignment;

import java.util.StringTokenizer;

public class Assignment59 {

	public static void main(String[] args) {
		 String s="a very fine day";
		String sa[]=s.split(" ");
		
		 StringBuffer s5 = new StringBuffer();
         
       for(int i=0;i<sa.length;i++){
               String s2 =sa[i];
               System.out.println(  s2);
               
               String s3 = s2.substring(0,1);
               System.out.println(  s3);
               String s4 = s2.substring(1, s2.length());
               System.out.println(  s4);
               s5.append(s3.toUpperCase()).append(s4).append(" ");
               System.out.println("------");
               
	}
         System.out.println(s5.toString());

}
}