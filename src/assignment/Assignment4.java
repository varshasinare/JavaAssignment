/*Find the addition of two array elemnents({0,1,2} and  {3,4,5})*/

package assignment;

public class Assignment4 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in)
		int a[]={9,9,9};
		int b[]={1,1,1};
		int result[]=new int[3];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			result[i]=a[i]+b[i];
			sum=sum+result[i];
		}
		System.out.println("Addition is "+sum);
		for(int j=0;j<a.length;j++)
		{
			System.out.print(result[j]+" ");
		}
	}

}
