package com.pri.program;

public class NewLinePrint {

	public static void main(String[] args) {
		/*
		 * Program to split each word in a sentence into a new line
		 */

		String val = "This is my new home";
		System.out.println(val);
		
		//1st way
		String inEachLine = String.join(System.lineSeparator(), val.split(" "));
		System.out.println(inEachLine);

		System.out.println("=============================================");
		
		//2nd way
		for (String word : val.split(" ")){
		    System.out.println(word);
		}
		
		System.out.println("=============================================");
		
		//3rd way
		String splitline = val.replace(" ", System.lineSeparator());
		System.out.println(splitline);
		
	}

}
