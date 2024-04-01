package curs4;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		int score;
		String calificativ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your score :");
		score = scan.nextInt();

		calificativ = (score >=90)?"Calificativul tau este FB":(score <=80?"Calificativul tau este B":"Calificativul tau este S");

}

	}


