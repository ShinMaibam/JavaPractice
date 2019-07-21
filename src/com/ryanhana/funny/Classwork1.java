package com.ryanhana.funny;

import java.util.Scanner;

public class Classwork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the first value: ");
		int a = new Scanner(System.in).nextInt();
		
		System.out.println("Enter the second value: ");
		int b = new Scanner(System.in).nextInt();
		
		System.out.println("Enter the first name: ");
		String c = new Scanner(System.in).nextLine();

		System.out.println("Enter the last name: ");
		String d = new Scanner(System.in).nextLine();
		
		int result;
		result = a+b;
		
		System.out.println(result);
		System.out.println(c.toUpperCase() + " " + d.toLowerCase());
		

	}

}
