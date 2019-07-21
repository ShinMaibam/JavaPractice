package com.pri.training;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		System.out.println("Enter the String");
		String input = new Scanner(System.in).next();
		
		//String reverseString = recstr(input);
		String reverseString = strIter(input);
		
		System.out.println(reverseString);
		
		if (input.toLowerCase().equals(reverseString.toLowerCase()))
		{
			System.out.println("Given String "+ input + " is a Palindrome");
		}
		else {
			System.out.println("Given String " +input+ "is NOT a Palindrome");
		}		
		
	}
	
	public static String recstr (String str) {
		
		if (str.length()<2) {
			return str;
		}
		return recstr(str.substring(1)) + str.charAt(0);
		
	}

	public static String strIter (String str) {
		
		StringBuilder strbuilder = new StringBuilder();
		
		char[] ca = str.toCharArray();
		
		for(int i=str.length()-1; i>=0; i--) {
			strbuilder.append(ca[i]);
		}
		
		return strbuilder.toString();
		
	}
	
	
}
