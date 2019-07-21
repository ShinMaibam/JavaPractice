package com.pri.training;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "This is my 1st Home in California. My cell Number is 612-222-1111";
		
		System.out.println(input);
		
		//SubString is used to remove unwanted char from the beginning.
		System.out.println(input.substring(5));
		
		//to remove all other characters other than letters
		System.out.println(input.replaceAll("[^a-zA-Z]", ""));
		
		//to replace all other character except letter to -
		System.out.println(input.replaceAll("[^a-zA-Z]", "*"));
		
		//to remove all other character except digits 
		System.out.println(input.replaceAll("[^0-9]", "")); 
		
		//to remove certain character say all digits from a string
		System.out.println(input.replaceAll("[0-9]", ""));
		
		//to replace certain character with different character
		System.out.println(input.replaceAll("[e]", "X"));
		
		//to replace certain characters with different characters
		System.out.println(input.replaceAll("[e,a]", "XY"));

		/*
		 * This is to remove certain word from a given sentence
		 */
		String str1 = "This is a mistake in the sentence which is listed here.";
		
		String remv = "\\s*\\bis\\b\\s*";
		String str2 = str1.replaceAll(remv, " ");
		System.out.println(str2);
		
		String regex1 = "\\bis\\b";
		String str3 = str1.replaceAll(regex1, "");
		System.out.println(str3);
		
		/*
		 * TO remove the additional white space before and after the text
		 */
		String val = "GOOD          ";
		
		System.out.println(val);
		System.out.println(val.length());
		System.out.println(val.trim());
		System.out.println(val.trim().length());
		
	}

}
