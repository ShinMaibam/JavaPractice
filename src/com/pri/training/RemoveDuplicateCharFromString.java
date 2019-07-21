package com.pri.training;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharFromString {
	
	public static void main(String args[])
    {
        String str = "engineer";
        RemoveDuplicates r = new RemoveDuplicates();
        r.removeDuplicates(str);
    }
}

class RemoveDuplicates{
	 
	 /* 
	  * Function removes duplicate characters from the string
	  */
	 

    public void removeDuplicates(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
         
        // print string after deleting duplicate elements
        for(Character ch : lhs)
            System.out.print(ch);
    }
    
}
	

/*public static void main(String[] args) {

		String str = "Educational";
		
		String rm = str.substring(5, 6);
		System.out.println(rm);
		
		System.out.println(str.replaceAll("a", ""));
		
		System.out.println(removeChar(str,'a'));

			    
}
	public static String removeChar(String s, char c) {
			    String r = "";
			    for (int i = 0; i < s.length(); i++) {
			      if (s.charAt(i) != c)
			        r += s.charAt(i);
			    }
			    return r;

			  }

}*/


