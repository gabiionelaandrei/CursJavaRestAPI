package curs3;

import java.util.Scanner;

public class HowOldAreYou {

	public static void main(String[] args) {
		int age; 
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your age :");
			age = scan.nextInt();	
		if (age >= 0 && age < 18) {
			System.out.println("Esti minor.");
		}
		else if(age >= 18 && age <= 65) {
			System.out.println("Esti adult.");
		}
		else {
			System.out.println("Esti batran.");
		}
	}

}
