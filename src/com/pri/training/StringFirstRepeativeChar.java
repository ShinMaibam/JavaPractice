package com.pri.training;

public class StringFirstRepeativeChar {

	public static void main(String[] args) {

		/*
		 * To find FIRST repeated character in a given String
		 */
		
		String input ="maibam pritam";
		
		boolean flag = false;
		
		char[] strarray = input.toCharArray();
		System.out.println(strarray);
		System.out.println(strarray.length);
		
		for (int i=0; i<strarray.length; i++)
			{
				for (int j=i+1; j<strarray.length; j++) 
				{
					if (strarray[i] == strarray[j])
					
					{
						System.out.println("The first repetative char in the given string is: "+ strarray[i]);
						flag=true;
						break;
					}
				}
				
				if (flag == true) {
					break;
				}
			}
	
	}	

		

}
