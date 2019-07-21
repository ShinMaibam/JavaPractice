package com.pri.training;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		String string = "engineering";

		/*
		 * Below line of codes will remove duplicate characters from a given string
		 */
		/*===========================Method 1================================*/
		
		char[] chars = string.toCharArray();
		Set<Character> present = new HashSet<>();
		//System.out.println(present);
		
		int len = 0;
		for (char c : chars)
		    if (present.add(c)) 
		    {
		     System.out.println(c);
		    	 chars[len++] = c;
		    }
		       

		//System.out.println(present);
		//System.out.println(len);
		
		String out = new String (chars, 0, len);
		System.out.println(out);
		
		//System.out.println(new String(chars, 0, len));
		
		/*============================END METHOD1============================*/
	
		/*================================METHOD 2===========================*/
		
		/*
		 * Below line of codes will remove duplicate characters from a given string
		 */
		/*
		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}
		System.out.println(charSet);

		
		
		 * Below lines of code will conver characters in array to a string
		 
		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
		 */	
		
		/*============================END METHOD2============================*/
		
	}

}
