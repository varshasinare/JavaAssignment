/*1. find the max length-word in a given string and return the max-length word. 
 * if two words are of same length return the first occuring word of max-length
input:"hello how are you aaaaa"
output:hello(length-5)*/

package assignment;

import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter String :");
		String s="hello how are you aaaaa";
		String s_array[]=s.split(" ");
		String word=" ";
		int max_length=0;
		for(int i=0;i<s_array.length-1;i++)
		{
			
				if(s_array[i].length()>=s_array[i+1].length())
				{
					word=s_array[i];
					s_array[i+1]=word;
					max_length=word.length();
					
				}
				else
				{
					word=s_array[i+1];
					max_length=word.length();
					
				}
			
		}
		System.out.println(word + "("+" length "+max_length+")");

	}

}
