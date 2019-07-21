package com.pri.training;

public class NumberCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numlist= {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(numlist.length);
		for (int i=0; i<numlist.length; i++)
		{
			for (int j=0; j<numlist.length; j++)
			{
				int sum = numlist[i]+numlist[j];
				
				if (sum == 2) 
				{
					System.out.println("Numbers which sum is 2 are: "+numlist[i]+ " and "+numlist[j]);
				}	
			}
			
		}

		
		
		
	}

}
