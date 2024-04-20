package curs11;

import java.util.Scanner;

public class ExceptionExample4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, result;
		
		while(true) {	
			System.out.println("Please enter number 1:");
			try {
				//Integer.parseInt()
				num1 = Integer.parseInt(scan.next());
			}catch(NumberFormatException e) {
				System.out.println("Please enter only numeric values");
				 continue;
			}
			if(num1 == 0 ) {
				System.out.println("One of the numbers is 0");
				continue;
			}
			while(true) {
				System.out.println("Please enter number 2:");
				try {
					num2 = Integer.parseInt(scan.next());
				}catch(NumberFormatException e) {
					System.out.println("Please enter only numeric values");
					 continue;
				}
				break;
			}	
			if(num2 == 0) {
				System.out.println("One of the numbers is 0");
				continue;
			}
		    result = num1/num2;
		    System.out.println("Result : " + result);
		    break;
		}


		
	}

	
	
	
}