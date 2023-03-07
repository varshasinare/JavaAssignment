/* Input a int array. Square the elements in even position and cube the elements in odd position and add them as result.
input: {1,2,3,4}
output: 1^3+2^2+3^3+4^2
*/
package assignment;

public class Assignment24 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]=new int[4];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		
			if(i%2==0)
			{
				b[i]=a[i]*a[i]*a[i];// use Math()
			}
			else
			{
				b[i]=a[i]*a[i];
			}
			sum=sum+b[i];
		}
		System.out.println("Output: "+sum);
	}

}
