package com.pri.training;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter the number up to which you want to print fibonacci series: ");
		
		//To get input from Console during execution
		int fibonum = new Scanner(System.in).nextInt();		
		
		//Loop to interate up to the given number for which fibonacci numbers to print
		for (int i=1; i<=fibonum; i++)
		{
			int value = fibo(i);
			System.out.println(value);
		}
			
	}

	/*
	 * Method to calculate Fibonacci number using Recursive
	 */
	
	public static int fibo (int num){
		if (num ==1 || num ==2)
		{
			return 1;
		}
		return fibo(num-1)+fibo(num-2);
	}
	
	
	
}
