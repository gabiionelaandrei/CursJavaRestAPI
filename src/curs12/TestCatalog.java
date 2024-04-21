package curs12;

import java.util.Scanner;

public class TestCatalog {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nume;
		int nota;
		System.out.println("What's your name?");
		nume = scan.next();
		System.out.println("What's your score?");
		nota = scan.nextInt();
		
		Catalog catalog = new Catalog();
		catalog.gasesteElev(nume,nota);
	}

}
