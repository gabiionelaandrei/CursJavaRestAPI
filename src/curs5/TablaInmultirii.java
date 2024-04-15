package curs5;

import java.util.Scanner;

public class TablaInmultirii {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int numar = scan.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(numar * i);
		}

	}
}
