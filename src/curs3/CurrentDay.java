package curs3;

import java.util.Scanner;

public class CurrentDay {

	public static void main(String[] args) {
		int day;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the current day (1 -first day of the week, etc :)");
		day = scan.nextInt();
		
		if(day ==0) {
			System.out.println("Te rog sa introduci un numar mai mare de 0.");
		}
		else if(day==1) {
			System.out.println("Astazi este luni.");
		}
		else if(day==2) {
			System.out.println("Astazi este marti.");
		}
		else if(day==3) {
			System.out.println("Astazi este miercuri.");
		}
		else if(day==4) {
			System.out.println("Astazi este Joi.");
		}
		else if(day==5) {
			System.out.println("Astazi este vineri.");
		}
		else if(day==6) {
			System.out.println("Astazi este sambata.");
		}
		else if(day==7) {
			System.out.println("Astazi este duminica.");
		}
		else{
			System.out.println("Saptamana are doar 7 zile. Te rog sa introduci un numar intre 1 si 7. ");
		}
	}

	}


