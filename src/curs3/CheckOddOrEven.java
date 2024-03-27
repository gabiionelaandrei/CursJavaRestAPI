package curs3;

import java.util.Scanner;



public class CheckOddOrEven {

	int numar; 
	
	public void askTheUserForANumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number :");
		numar = scan.nextInt();	
	}
	
	public void checkNrIsOddOrEven() {
		askTheUserForANumber();
		
		if( numar % 2 == 0) {
			System.out.println("Number is even!");
			
		}else {
			System.out.println("Number is odd!");

		}

			
	}
	

	
	
}