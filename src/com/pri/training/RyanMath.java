package com.pri.training;

import java.util.Scanner;

public class RyanMath {

	public static void main(String[] args) {

		System.out.println("Enter the first Number: ");
		int num1 = new Scanner(System.in).nextInt();
		
		System.out.println("Enter the second Number: ");
		int num2 = new Scanner(System.in).nextInt();
		
		System.out.println("Select the function you want to perform: \n"
				+ "1 for Addition \n"
				+ "2 for subtraction \n"
				+ "3 for Multiplication \n"
				+ "4 for Division");
		
		int option = new Scanner(System.in).nextInt();
		
		switch (option) {
		
		case 1:
				int addition = num1+num2;
				System.out.println("Addition of "+num1+ " and "+num2+" is: "+ addition);
				break;
	
		case 2:
				int sub = num1-num2;
				System.out.println("Subtration of "+num2+ " from "+num1+" is: "+ sub);
				break;
			
		case 3:
				int multi = num1*num2;
				System.out.println("Multiplication of "+num1+ " and "+num2+" is: "+ multi);
				break;
	
		case 4:
				float div = num1/num2;
				System.out.println(num1+" divided by "+num2+" is: "+ div);
				break; 
		}		
	}

}
