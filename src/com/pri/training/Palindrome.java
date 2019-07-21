package com.pri.training;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		/*
		 * Program to check if a given string is Palindrome or Not
		 */
		
		System.out.println("Enter the String to check for Palindrome: ");
		String inputStr = new Scanner(System.in).next();
		String reverseString = palindromecheck(inputStr);
		//String reverseString = recursivereverse(inputStr);	
		System.out.println(reverseString);
		
		if (inputStr.toLowerCase().equals(reverseString.toLowerCase()))
		{
			System.out.println("Given String \""+inputStr+ "\" is a Palindrome");
		}
		else {
			System.out.println("Given String \""+inputStr+ "\" is NOT a Palindrome");
		}
	}

	/*
	 * This java method is to reverse a given string using Iteration
	 */	
	public static String palindromecheck(String str) {

		StringBuilder strbuilder = new StringBuilder();
		char[] charlist = str.toCharArray();
		
		for (int i = charlist.length-1; i>=0; i--)
		{
			strbuilder.append(charlist[i]);
		}
		return strbuilder.toString();
	}

	/*
	 * This java method is to reverse a given string using Recursive
	 */	
	public static String recursivereverse (String str) {
		
		if (str.length()<2) {
			return str;
		}
		return recursivereverse(str.substring(1)) + str.charAt(0);		
	}

}
