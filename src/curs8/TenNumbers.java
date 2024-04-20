package curs8;

import java.util.Scanner;

public class TenNumbers {

	public static void main(String[] args) {
		Scanner scan  =  new Scanner(System.in);
		int number, sum = 0;
		int[] numbers = new int[10];

		System.out.println("Please enter the 10 numbers: ");
		
		for(int i = 0; i<numbers.length; i++) {
			number=scan.nextInt();
			numbers[i] =number;
			sum =sum + number;
		}
		System.out.println("The sum of your numbers is: " + sum);
	}

}
