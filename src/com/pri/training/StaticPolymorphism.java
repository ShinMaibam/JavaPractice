package com.pri.training;

public class StaticPolymorphism {

	public static void main(String[] args) {
		/*
		 * Static Polymorphism Exmaple
		 */
		
		sPolymprphism sm = new sPolymprphism();
		System.out.println(sm.add(2,3));
		System.out.println(sm.add(2,3,4));
		System.out.println(sm.add(2, 3.5));
		System.out.println(sm.add(2.5, 3));

	}

}

class sPolymprphism{

	public int add (int x, int y) {
		
		return x+y;
	}
	
	public int add (int x, int y, int z) {
		return x+y+z;
	}
	
	public int add (int x, double y) {
		return x + (int)y;
	}
	
	public int add (double x, int y) {
		return (int)x + y;
	}
	
}