/*61.for the given string display the middle 2 value, case satisfies only if string is of even length
ip - java
op - av*/
package assignment;

public class Assignment61 {

	public static void main(String[] args) {
		String str="java";
		int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
       System.out.println(str.substring(position, position + length)); 

	}

}
