package com.ryanhana.funny;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CashBank {

	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args) {

		/*
		 * Coins: 1, 2, 5, 10, 20, 50, 100, 200, 500 
		 * Notes: 10.00, 20.00, 50.00, 100.00, 500.00, 2000.00
		 */

		List<Double> noteList = new ArrayList<Double>();
		List<Double> coinList = new ArrayList<Double>();
		
		double blc = 0.00;
		double zero = 0.00;
		double price = 5.02;

		System.out.println("=======ATTENTION: Please pay the amount and hit ENTER============\n");
		String ip = new Scanner(System.in).nextLine();
		String deposit = ip.toLowerCase().trim();

		blc = Double.parseDouble(deposit) - price;
		System.out.println("======== ATTENTION: Balance amount to Return is=====" + df2.format(blc));

		//coins
		double a = 0.01;
		double b = 0.02;
		double c = 0.05;
		double d = 0.10;
		double e = 0.20;
		double f = 0.50;
		double g = 1.00;
		double h = 2.00;
		double i = 5.00;

		//notes
		double m = 10.00;
		double n = 20.00;
		double o = 50.00;
		double p = 100.00;
		double q = 500.00;
		double r = 2000.00;

		for (int j = 0; j < 20; j++) {
			
			System.out.println("======= Remaining Balance is======" + df2.format(blc));
			
			/*if (blc == zero) {
				System.out.println("======= Balance is ZERO======");
				break;
			} else {*/
				if (blc < 2000.00 && blc >= 500.00) {
					blc = blc - q;
					noteList.add(q);
				} else if (blc < 500.00 && blc >= 100.00) {
					blc = blc - p;
					noteList.add(p);
				} else if (blc < 100.00 && blc >= 50.00) {
					blc = blc - o;
					noteList.add(o);
				} else if (blc < 50.00 && blc >= 20.00) {
					blc = blc - n;
					noteList.add(n);
				} else if (blc < 20.00 && blc >= 10.00) {
					blc = blc - m;
					noteList.add(m);
				} else if (blc < 10.00 && blc >= 5.00) {
					blc = blc - i;
					coinList.add(i);
				} else if (blc < 5.00 && blc >= 2.00) {
					blc = blc - h;
					coinList.add(h);
				} else if (blc < 2.00 && blc >= 1.00) {
					blc = blc - g;
					coinList.add(g);
				} else if (blc < 1.00 && blc >= 0.50) {
					blc = blc - f;
					coinList.add(f);
				} else if (blc < 0.50 && blc >= 0.20) {
					blc = blc - e;
					coinList.add(e);
				} else if (blc < 0.20 && blc >= 0.10) {
					blc = blc - d;
					coinList.add(d);
				} else if (blc < 0.10 && blc >= 0.05) {
					blc = blc - c;
					coinList.add(c);
				} else if (blc < 0.05 && blc >= 0.02) {
					blc = blc - b;
					coinList.add(b);
				} else if (blc < 0.02 && blc >= 0.01) {
					blc = blc - a;
					coinList.add(a);
				} else {
					break;
				}
			}
		
		System.out.println("========NOTES to Return ===========" + noteList.toString());
		System.out.println("========COINS to Return ===========" + coinList.toString());
	}

}
