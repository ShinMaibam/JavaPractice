package com.pri.training;

import java.util.Scanner;

public class FirstNonRepetiveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * This method is to find first non-repetitive character in a given String.
		 * This works for all condition eg. "maibam" or "engineering".
		 */
		
		//String str1 = "maibam";
		System.out.println("Enter the String: ");
		String str1 = new Scanner(System.in).nextLine();
		
		String str = str1.toLowerCase();
		
		char[] ca = str.toCharArray();
		boolean flag = false;
		int j=0;
		for (int i=0; i<ca.length; i++)
		{
			for ( j=0; j<ca.length; j++)
				
			if (i!=j){	
				{
					if(ca[i] == ca[j])
					{
						flag = false;
						break;
					}
					flag=true;
				}
			}
			System.out.println(flag);
			
			if(flag == true)
			{
			System.out.println("The First non-repetitive char in the given is: "+ca[i]);
			break;
			}
		}

	}

}
