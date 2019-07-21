package com.pri.training;

public class DuplicateString2 {

	public static void main(String[] args) {
		/*
		 * This method removes duplicate character from a giving string
		 */
		
	        String s = "engineering";
	        String s2 = "";
	        for (int i = 0; i < s.length(); i++) {
	            Boolean found = false;
	            //System.out.println("Value of i: "+i);
	          	//System.out.println(s2.length());
	            for (int j = 0; j < s2.length(); j++) {
	            		//System.out.println("value of J: "+j);
	                if (s.charAt(i) == s2.charAt(j)) {
	                    found = true;
	                    break; //don't need to iterate further
	                }
	            }
	            if (found == false) {
	                s2 = s2.concat(String.valueOf(s.charAt(i)));
	            }
	        }
	        System.out.println(s2);
	    }
		

}
