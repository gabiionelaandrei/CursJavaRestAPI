package curs6;

import java.util.Scanner;

public class ForAndWhile {
	static Scanner scan = new Scanner(System.in);
	static int nr1;
	static int nr2;

	public static void main(String[] args) {
		//rezolvareCuFor();
		rezolvareCuWhile();
	}

	public static void rezolvareCuFor() {
		System.out.println("Introdu primul nr:");
		nr1 = scan.nextInt();
		System.out.println("Introdu al doilea nr:");
		nr2 = scan.nextInt();
		for (int i = Math.min(nr1, nr2) + 1; i < Math.max(nr1, nr2); i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void rezolvareCuWhile() {
		System.out.println("Introdu primul nr:");
		nr1 = scan.nextInt();
		System.out.println("Introdu al doilea nr:");
		nr2 = scan.nextInt();
		int j =Math.min(nr1, nr2)+1;
		while (j < Math.max(nr1, nr2)) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j++;
		}
	}
}
