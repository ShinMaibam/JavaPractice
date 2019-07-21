package com.pri.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringNonRepetativeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * To find Non-repeated characters in a given String
		 */
			String str ="engineer";
	        System.out.println(removeDups(str));
	    }
		
	static String removeDupsSorted(String str) {
		
		
		int res_ind=1, ip_ind=1;
		char arr[] = str.toCharArray();
		
		while (ip_ind != arr.length)
        {
            if(arr[ip_ind] != arr[ip_ind-1])
            {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
           
        }
     
        str = new String(arr);
        return str.substring(0,res_ind);
	}
	
	static String removeDups(String str)
    {
       // Sort the character array
       char temp[] = str.toCharArray();
       Arrays.sort(temp);
       str = new String(temp);
        
       // Remove duplicates from sorted
       return removeDupsSorted(str);
    }
		
		
	/*	String r = "";
		for (int i=0; i<ca.length; i++)
		{
			for (int j=i+1; j<ca.length; j++)
			{
				if (str.charAt(i) == ca[j]) {
					r += str.charAt(i);
					break;	
				}	
			}
		}
		
		System.out.println(r);
		StringBuilder sb = new StringBuilder();
	
		StringBuilder sb = new StringBuilder();
		sb.append(ca);
		System.out.println(ca.length);
		String r = "";
		for (int i=0; i<ca.length; i++)
			{
				for (int j=i+1; j<ca.length; j++)
				{
					if (ca[i] == ca[j]) {
						r += sb.charAt(i);
					}
				}
		
		
		}
		System.out.println(r);
		
		for (int i=0; i<r.length(); i++)
		{
			StringBuilder sb2 = new StringBuilder();
			sb.append(r);
			sb.deleteCharAt(i);
			
			System.out.println(str2);
		}
	
		
		sb.deleteCharAt(5);
		ca = r.toString().toCharArray();
		System.out.println(ca);
	}
	
	
	
	public static boolean comparechar (CharSequence a, CharSequence b) {
		 if (a.length() < b.length()) {
		      return false;
		    }
		 for (int i = 0; i < b.length(); i++) {
		      char slc = Character.toLowerCase(a.charAt(i));
		      char tlc = Character.toLowerCase(b.charAt(i));
		      if (slc != tlc) {
		        return false;
		      }
		    }
		    return true;
		
		
	}
	*/
	
	
	
}
