package com.pri.training;

import java.util.Scanner;

public class PrimeNumberList {

	public static void main(String[] args) {
		/*
		 * Method to generate all Prime Number list up to a give number
		 */

		System.out.println("Enter the number up to which all prime number list to print: ");
		int num = new Scanner(System.in).nextInt();

		int i=0,n=0;
		String PrimeNum = "";
		
		for (i=1;i<=num; i++)
		{
			int counter =0;
			for (n=i; n>=1; n--)
			{
				if (i%n == 0)
				{
					counter=counter+1;
				}
			}
		if (counter ==2)
			{
				PrimeNum=PrimeNum+i+" ";
			}
		}
		System.out.println("Prime Number list: "+ PrimeNum);
		
		
		
	}

}
