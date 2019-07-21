package com.pri.training;

public class OccuranceOfChar {

	public static void main(String[] args) {
		/*
		 * This method gives the count of a specific character in a given string
		 */
		
		String input = "Word occurance of a 1 String";
		char tt = 'a';
		
		int charCount = 0; //resetting character count
        for(char ch: input.toCharArray()){
            if(ch == tt){
                charCount++;
            }
        }     
        System.out.println("count of character " + tt + " on given String is: " + charCount);
    }

}
