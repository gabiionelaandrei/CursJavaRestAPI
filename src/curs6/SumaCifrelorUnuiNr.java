package curs6;

import java.util.Scanner;

public class SumaCifrelorUnuiNr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please add a number: ");
		int nr = scan.nextInt();
		int suma = 0;
		while (nr != 0) {
			suma = suma + nr % 10;
			nr = nr / 10;
		}
		System.out.println("The sum of the digits' number is: " +suma);
	}

}
