package com.pri.training;

public class BeforeMainMethod {

	static {
		beforeMethod();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is ther main method");	
	}

	public static void beforeMethod() {
		System.out.println("This method execute before main method");
	}
	
}
