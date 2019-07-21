package com.pri.training;

import java.util.Scanner;

public class UserInput_Scanner {

	public static void main(String[] args) {
		/*
		 * Method to delete unwanted character from a given string
		 */

		String strOrig, word;
	    	Scanner scan = new Scanner(System.in);
	       
	    	System.out.print("Enter a String : ");
	    	strOrig = scan.next();
	       
	    	System.out.print("Enter a Word to be Delete from the String : ");
	    	word = scan.next();
	       
	    	System.out.print("Deleting all '" + word + "' from '" + strOrig + "'\n");
	    	strOrig = strOrig.replaceAll(word, "");
	    	
	    	System.out.print("Specified word deleted Successfully from the String..!!"); 
	    	System.out.print("\nNow the String is :\n");
	    	System.out.print(strOrig);     
		
		
	}

}
