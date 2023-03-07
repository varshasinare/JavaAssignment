/* Retrieve the max from array which is in a odd-index */
package assignment;

public class Assignment36 {

	public static void main(String[] args) {
		int a[]= {23,46,65,32,73,82};
		int a_max=0;
		for(int i=1;i<a.length-1;i+=2) 
		{
			if(a[i]>=a[i+2])
			{
				a_max=a[i];
				a[i+2]=a[i];
			}
			else
			{
				a_max=a[i+2];
			}
		}
		System.out.println(a_max);
	}

}
