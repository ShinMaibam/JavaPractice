package com.pri.training;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Method to identify a given number is prime number or not
		 */

		System.out.println("Enter the Number to check for Prime Number or not: ");
		int num = new Scanner(System.in).nextInt();
		boolean prime = true;
		
		if (num==0 ||num==1) 
		{
			System.out.println("Given number is Not Prime");
		}
		else 
		{
			for (int i=2; i<=Math.sqrt(num); i++)
			{
				if (num%i == 0)
				{
					System.out.println("Given number is Not Prime");
					prime = false;
					break;
				}
			}
			if (prime == true) {
				System.out.println("Given number is Prime");
			}
		}
	}
	

}
