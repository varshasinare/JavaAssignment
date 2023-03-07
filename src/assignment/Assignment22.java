/*Get two integer arrays as input. Find if there are common elements in the arrays. 
 find the number of common elements.
input1: {1,2,3,4}
input2: {3,4,5,6}
output: 4(3,4,3,4)*/

package assignment;

import java.util.*;

public class Assignment22 {

	public static void main(String[] args) {
	
		int input1[]= {1,2,3,4};
		int input2[]= {3,4,5,8};
		int output[]= new int[4];
		int k=0;
		
		for(int i=0;i<4;i++)						////to copy elements from first array
		{
			for(int j=0;j<4;j++)
			{
				if(input1[i]==input2[j])
				{
					output[k]=input1[i];
					k++;
					
				}
			}
		}
		for(int i=0;i<4;i++)					//to copy elements from second array
		{
			for(int j=0;j<4;j++)
			{
				if(input2[i]==input1[j])
				{
					output[k]=input2[i];
					k++;
					
				}
			}
		}
		System.out.print(output.length);
		System.out.print("{ ");
		for(int i=0;i<output.length;i++)
		{
			System.out.print(output[i]+" ");
		}
		System.out.print("}");
		
		
	}

}
