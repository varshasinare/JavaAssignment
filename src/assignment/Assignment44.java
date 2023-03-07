/*44.  input:
    Searchstring s1="GeniusRajkumarDev";
					 0123456789	
    String s2="Raj";
    String s3="Dev";
   output:
        Return 1 if s2 comes before s3 in searchstring else return 2
*/
package assignment;

public class Assignment44 {

	public static void main(String[] args) {
		String s1="GeniusDevkumarRaj";
		String s2="Raj";
		String s3="Dev";
				
		 int n1 = s1.indexOf(s2);
         int n2 = s1.indexOf(s3);
        
         if(n1 < n2)
        	 System.out.println("1");
        	 
         else
        	System.out.println("2");
	}

}
