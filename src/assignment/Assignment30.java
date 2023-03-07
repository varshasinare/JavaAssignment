//10. Write a Program that accepts a string and removes the duplicate characters.
package assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Assignment30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		char[] charArray = s.toCharArray();
		HashSet<Character> s_result = new  HashSet<>();
	    
	    for (char ch : charArray) {
	    	s_result.add(ch);
	    }
	    
	    s_result.forEach(x->{
	    System.out.print(x);	
	    });
	   
	}

}
