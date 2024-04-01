package curs5;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		int nr1 = 0;
		int nr2 = 0;
		int nr3 = 0;
		int nr4 = 0;
		int nr5 = 0;
		int nr6 = 0;
		int nr7 = 0;
		int nr8 = 0;
		int nr9 = 0;
		int nr10 = 0;
		int suma = 0;
		Scanner scan = new Scanner(System.in);
	
		for(int i = 0; i < 10; i++ ) {
		System.out.println("Please enter number 1 :");
		nr1 = scan.nextInt();
		suma+=nr1;
		System.out.println("Please enter number 2 :");
		nr2 = scan.nextInt();
		suma+=nr2;
		System.out.println("Please enter number 3 :");
		nr3 = scan.nextInt();
		suma+=nr3;
		System.out.println("Please enter number 4 :");
		nr4 = scan.nextInt();
		suma+=nr4;
		System.out.println("Please enter number 5 :");
		nr5 = scan.nextInt();
		suma+=nr5;
		System.out.println("Please enter number 6 :");
		nr6 = scan.nextInt();
		suma+=nr6;
		System.out.println("Please enter number 7 :");
		nr7 = scan.nextInt();
		suma+=nr7;
		System.out.println("Please enter number 8 :");
		nr8 = scan.nextInt();
		suma+=nr7;
		System.out.println("Please enter number 9 :");
		nr9 = scan.nextInt();
		suma+=nr9;
		System.out.println("Please enter number 10 :");
		nr10 = scan.nextInt();
		suma+=nr10;
		break;
		
	}
		System.out.println("The sum of numbers : " + nr1 + ", "+ nr2 + ", "+ nr3 + ", "+ nr4 + ", "+ nr5 + ", "+ nr6 + ", "+ nr7 + ", "+ nr8 + ", "+ nr9 + ", "+ nr10 + " is " + suma);
}
}
