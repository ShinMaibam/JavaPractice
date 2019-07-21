package com.pri.program;

public class Excel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inv = 3;
		
		double a = 0.650;
		double b = 0.250;
		double c = 0.500;
		double big = 0.0;
		
		int x = 18;
		int y = 21;
		int z = 12;
		
		for (int i = 0; i< inv; i++) {
		
			big = cal_larger_no(a,b,c);
			System.out.println("Largerst value is "+ big );
	
			if (big == a) {
				x=x+3;
			}
			if (big == b) {
				y=y+3;
			}
			if (big == c) {
				z=z+3;
			}
			
			System.out.println("value of a is: "+ x);
			System.out.println("value of a is: "+ y);
			System.out.println("value of a is: "+ z);
		}
		
	}

	
	public static double cal_larger_no(double a, double b, double c)
	{
		double larger =0;
		if(a > b & a > c) {
			larger = a;
		}else if(b>a & b>c) {
			larger = b;
		}else {
			larger = c;
		}
		return larger;
	}
	
	
}
