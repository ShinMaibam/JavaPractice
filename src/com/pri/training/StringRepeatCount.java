package com.pri.training;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringRepeatCount {

	public static void main(String[] args) {

		/*
		 * To find repeated characters in a given String
		 */
		
		String str ="Engineering";
		String input = str.toLowerCase();
		
		char[] strarray = input.toCharArray();
		System.out.println(strarray.length);
		for (int i=0; i<strarray.length; i++)
			{
				for (int j=i+1; j<strarray.length; j++) 
				{
					if (strarray[i] == strarray[j])	
					{
						System.out.println("Repetative char in the given string is: "+ strarray[i]);
						break;
					}
				}
	
			}
	
	}		
	
}
