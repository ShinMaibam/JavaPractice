package com.pri.training;

public class ReverseString {

	public static void main(String[] args) {

		String originaltxt="Nongpokleima";
		System.out.println("Original String is: " + originaltxt);
	
		//using String Buffer to reverse string. Easy & Simple
		String reversetxt = new StringBuffer(originaltxt).reverse().toString();
		System.out.println("Reverse String String Buffer is: " + reversetxt);
		
		// Using Iteration
		String reversestr = reverse(originaltxt);
		System.out.println("Reverse String using Iteration is: " + reversestr);
		
		// Using Recursive
		String recursivereversestr = reverserecursive(originaltxt);
		System.out.println("Reverse String using recursive is: " + recursivereversestr);	
	}

	/*
	 * Method to reverse a String using Iteration
	 */	
	public static String reverse(String str) {
		
		StringBuilder strbuilder= new StringBuilder();
		
		char[] charlist = str.toCharArray();
		
		for (int i=charlist.length-1; i>=0; i--)
		{
			strbuilder.append(charlist[i]);	
		}
		return strbuilder.toString();
	}
	
	/*
	 * Method to reverse string using Recursive
	 */	
	public static String reverserecursive (String str) {
		
		if (str.length() < 2) {
			return str;
		}
		return reverserecursive(str.substring(1)) + str.charAt(0);		
	}

}
