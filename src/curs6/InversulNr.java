package curs6;

import java.util.Scanner;

public class InversulNr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please add a number: ");
		int nr = scan.nextInt();
		int reversedNr = 0;

		while (nr != 0) {
			int rest = nr % 10;
			reversedNr = reversedNr * 10 + rest;
			nr = nr / 10;
		}
		System.out.println("The reverse of the given number is: " + reversedNr);
	}
}
