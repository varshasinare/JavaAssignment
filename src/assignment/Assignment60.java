/*60. Take the word with a max length in the given sentence
 in that check for vowels if so count the no.of occurrences !
  Input 1="Bhavane is a good girl"
  Output =3
  Input 1="Bhavanee is a good girl"
  Output =4
*/
package assignment;

public class Assignment60 {

	public static void main(String[] args) {
		String s="Bhavane is a good girlaaaa";
		String s1[]=s.split(" ");
		String t=" ";
		String vovels="AEIOUaeiou";
		int n1 = 0, max = 0,n=0;
		for(int i=0;i<s1.length;i++)
		{   
			n=s1[i].length();
			//n1=s1[i+1].length();
			if(n>max)
			{
				max=n;
				t=s1[i];
				
			}
			else
			{
				
			}
			
		}
		System.out.println(max+"  "+t);
		n=0;
		for(int i = 0;i < t.length();i++)
		{
            for(int j = 0;j < vovels.length();j++)
            {
                  if(t.charAt(i) == vovels.charAt(j))
                  {
                        n++;
                  }
            }
		}
		System.out.println(n);

	}

}
