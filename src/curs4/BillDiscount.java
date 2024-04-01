package curs4;

import java.util.Scanner;

public class BillDiscount {

	public static void main(String[] args) {
		double bill;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your bill amountc :");
		bill = scan.nextDouble();
		double discount;
		double total_amount;
	//ternary solution
		//total_amount= (bill <= 100 )? bill - (bill*5)/100: bill - (bill*10)/100;
		
		//if solution
		if(bill <= 100) {
			total_amount=bill - (bill*5)/100;
			
		}
		else {
			total_amount=bill - (bill*10)/100;
		}
		System.out.println("You have to pay: " +  total_amount);
	}

}
