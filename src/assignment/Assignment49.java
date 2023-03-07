/*Given array of intergers,print the sum of elements squaring/cubing as per the power of their indices.         
answer=  sum=sum+a[i]^i;
eg:input:{2,3,5}
Output:29*/
package assignment;
import java.util.*;

public class Assignment49 {

	public static void main(String[] args) {
		int a[]={2,3,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		 sum = sum+(int) Math.pow(a[i], i);
		}
		System.out.println(sum);

	}

}
