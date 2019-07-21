package com.ryanhana.funny;

import java.util.Random;
import java.util.Scanner;

public class ChooseOption extends Constant{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Family Funny Game\n");
		
		System.out.println("START");
		
		System.out.println("Please enter your name and hit ENTER");
		String ip = new Scanner(System.in).nextLine();
		String name = ip.toLowerCase().trim();
		
		System.out.println("Type Boy or Girl and hit ENTER");
		String boygirl = new Scanner(System.in).nextLine();
		String inval1 = boygirl.toLowerCase().trim();
		
		System.out.println("Type Brother or Sister and hit ENTER");
		String brosis = new Scanner(System.in).nextLine();
		String inval2 = brosis.toLowerCase().trim();
		
		System.out.println("Type Father or Mother and hit ENTER");
		String dadmom = new Scanner(System.in).nextLine();
		String inval3 = dadmom.toLowerCase().trim();
		
		System.out.println("Your selected these options: " + inval1 + " | " + inval2 + " | " + inval3);
		
		System.out.println("\nSelect any number between 1 to 10");
		int num = new Scanner(System.in).nextInt();
		
		int num1 = ran_val();
		
		switch (num1) {
		
		case 1:
			System.out.println("Hi "+ name + "!");
			scn_case(num, name, inval1, inval2, inval3);
			System.out.println(val1);
			System.out.println(val20);
			break;
				
		case 2:
			System.out.println("Hi "+ name + "!");
			scn_case(num, name, inval1, inval2, inval3);
			System.out.println(val2);
			System.out.println(val19);
			break;
			
		case 3:
			System.out.println("Hi "+ name + "!");
			scn_case(num, name, inval1, inval2, inval3);
			System.out.println(val3);
			System.out.println(val18);
			break;
			
		case 4:
			System.out.println("Hi "+ name + "!");
			scn_case(num, name, inval1, inval2, inval3);
			System.out.println(val4);
			System.out.println(val17);
			break;
			
		case 5:
			System.out.println("Hi "+ name + "!");
			scn_case(num, name, inval1, inval2, inval3);
			System.out.println(val5);
			System.out.println(val16);
			break;
			
		case 6:
			System.out.println("Hi "+ name + "!");
			scn_case(num, name, inval1, inval2, inval3);
			System.out.println(val6);
			System.out.println(val15);
			break;
			
		case 7:
			System.out.println("Hi "+ name + "!");
			scn_case(num, name, inval1, inval2, inval3);
			System.out.println(val7);
			System.out.println(val14);
			break;
			
		case 8:
			System.out.println("Hi "+ name + "!");
			scn_case(num, name, inval1, inval2, inval3);
			System.out.println(val8);
			System.out.println(val13);
			break;
			
		case 9:
			System.out.println("Hi "+ name + "!");
			scn_case(num, name, inval1, inval2, inval3);
			System.out.println(val9);
			System.out.println(val12);
			break;
		
		case 10:
			System.out.println("Hi "+ name + "!");
			scn_case(num, name, inval1, inval2, inval3);
			System.out.println(val10);
			System.out.println(val11);
			break;
		
		}
		
		
	}

	
	
	public static String ThumsUp_boy(String inval1, String inval2, String inval3) {
		
		String printmsg ="";
		
		if (inval1.equals("boy") && inval2.equals("brother") && inval3.equals("father")){
			printmsg = msg1;
		}else if (inval1.equals("boy") && inval2.equals("brother") && inval3.equals("mother")){
			printmsg = msg2; 
		}else if (inval1.equals("boy") && inval2.equals("sister") && inval3.equals("mother")){
			printmsg = msg5; 
		}else if (inval1.equals("girl") && inval2.equals("sister") && inval3.equals("mother")){
			printmsg = msg4; 
		}else if (inval1.equals("boy") && inval2.equals("sister") && inval3.equals("father")){
			printmsg = msg3; 
		}else if (inval1.equals("girl") && inval2.equals("sister") && inval3.equals("father")){
			printmsg = msg6; 
		}else if (inval1.equals("girl") && inval2.equals("brother") && inval3.equals("mother")){
			printmsg = msg7; 
		}else if (inval1.equals("girl") && inval2.equals("brother") && inval3.equals("father")){
			printmsg = msg8; 
		}else {
			printmsg = TEXT;
		}
		
		return printmsg;
		
	}
	
	public static String ThumsUp_girl(String val1, String val2, String val3) {
		
		String printmsg = "";
		
		if (val1.equals("boy") && val2.equals("brother") && val3.equals("father")){
			printmsg = txt1;
		}else if (val1.equals("boy") && val2.equals("brother") && val3.equals("mother")){
			printmsg = txt2; 
		}else if (val1.equals("boy") && val2.equals("sister") && val3.equals("mother")){
			printmsg = txt3; 
		}else if (val1.equals("girl") && val2.equals("sister") && val3.equals("mother")){
			printmsg = txt4; 
		}else if (val1.equals("boy") && val2.equals("sister") && val3.equals("father")){
			printmsg = txt5; 
		}else if (val1.equals("girl") && val2.equals("sister") && val3.equals("father")){
			printmsg = txt6; 
		}else if (val1.equals("girl") && val2.equals("brother") && val3.equals("mother")){
			printmsg = txt7; 
		}else if (val1.equals("girl") && val2.equals("brother") && val3.equals("father")){
			printmsg = txt8; 
		}else {
			printmsg = TEXT;
		}
		
		return printmsg;
		
	}
	
public static String ThumsUp_lei(String val1, String val2, String val3) {
		
		String printmsg = "";
		
		if (val1.equals("boy") && val2.equals("brother") && val3.equals("father")){
			printmsg = lei1;
		}else if (val1.equals("boy") && val2.equals("brother") && val3.equals("mother")){
			printmsg = lei2; 
		}else if (val1.equals("boy") && val2.equals("sister") && val3.equals("mother")){
			printmsg = lei3; 
		}else if (val1.equals("girl") && val2.equals("sister") && val3.equals("mother")){
			printmsg = lei4; 
		}else if (val1.equals("boy") && val2.equals("sister") && val3.equals("father")){
			printmsg = lei5; 
		}else if (val1.equals("girl") && val2.equals("sister") && val3.equals("father")){
			printmsg = lei6; 
		}else if (val1.equals("girl") && val2.equals("brother") && val3.equals("mother")){
			printmsg = lei7; 
		}else if (val1.equals("girl") && val2.equals("brother") && val3.equals("father")){
			printmsg = lei8; 
		}else {
			printmsg = TEXT;
		}
		
		return printmsg;
		
	}

	public static String ThumsUp_man(String val1, String val2, String val3) {
		
		String printmsg = "";
		
		if (val1.equals("boy") && val2.equals("brother") && val3.equals("father")){
			printmsg = pri1;
		}else if (val1.equals("boy") && val2.equals("brother") && val3.equals("mother")){
			printmsg = pri2; 
		}else if (val1.equals("boy") && val2.equals("sister") && val3.equals("mother")){
			printmsg = pri3; 
		}else if (val1.equals("girl") && val2.equals("sister") && val3.equals("mother")){
			printmsg = pri4; 
		}else if (val1.equals("boy") && val2.equals("sister") && val3.equals("father")){
			printmsg = pri5; 
		}else if (val1.equals("girl") && val2.equals("sister") && val3.equals("father")){
			printmsg = pri6; 
		}else if (val1.equals("girl") && val2.equals("brother") && val3.equals("mother")){
			printmsg = pri7; 
		}else if (val1.equals("girl") && val2.equals("brother") && val3.equals("father")){
			printmsg = pri8; 
		}else {
			printmsg = TEXT;
		}
		
		return printmsg;
		
	}
	
	public static void scn_case(int num, String name, String inval1, String inval2, String inval3) {
		String message = "";
		if (name.equals("ryan") || name.equals("butot") || name.equals("chabot") || name.equals("tubilai") || name.equals("chatumma") 
				|| name.equals("haya") || name.equals("tubot")){
			message = ThumsUp_boy(inval1, inval2, inval3);
			System.out.println(message);
		}else if (name.equals("hana") || name.equals("nirvana") || name.equals("bonzilai") || name.equals("hanathoibi") || name.equals("honeybon")){
			message = ThumsUp_girl(inval1, inval2, inval3);
			System.out.println(message);
		}else if (name.equals("lei") || name.equals("leima") || name.equals("be") || name.equals("nongpokleima") || name.equals("thoi") || name.equals("nganthoi")){
			message = ThumsUp_lei(inval1, inval2, inval3);
			System.out.println(message);
		}else if (name.equals("pritam") || name.equals("shin") || name.equals("ibungo") || name.equals("tubipa") || name.equals("oja") || name.equals("appa")){
			message = ThumsUp_man(inval1, inval2, inval3);
			System.out.println(message);
		}
		else {
			System.out.println("Your name " + name + " is Not in the family list. Sorry! can't play with you. Bye!");
		}
	}


	public static int ran_val() {
		Random rand = new Random(); 
		int n = rand.nextInt(10) + 1;
		return n;
	}
	
}
