/*1)Find Average of an array values(double type {10.1,11.2,12.3,13.4,14.5}) */

package assignment;
public class Assignment3 {

	public static void main(String[] args) {
		double a[]= {10.1,11.2,12.3,13.4,14.5};
		double sum=0;
		double average=0;
		for(double i:a)
		{
			sum=sum+i;
			
		}
		average=sum/(a.length);
		System.out.println("Average is :" + average);
		

	}

}
