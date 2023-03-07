/*37. GIVEN A STRING 555-666-1234
DISPLAY AS 55-56-661-234?
*/
package assignment;

public class Assignment37 {

	public static void main(String[] args) {
		String s="555-666-1234";
		String sa[]=s.split("-");
		String s1 = sa[0];
        String s2 = sa[1];
        String s3 = sa[2];
        
        StringBuffer sb = new StringBuffer();
        sb.append(s1.substring(0, s1.length()-1)).append('-');
        sb.append(s1.charAt(s1.length()-1)).append(s2.charAt(0)).append('-');
        sb.append(s2.substring(1, s2.length())).append(s3.charAt(0)).append('-');
        sb.append(s3.substring(1, s3.length()));
       System.out.println(sb.toString()); 

	}

}
