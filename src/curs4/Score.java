package curs4;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		int score;
		String calificativ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your score :");
		score = scan.nextInt();

		 calificativ = (score>=90)?"FB":(score<90&&score>=80)?"B":"S";

		String message = (calificativ == "FB" )? "Ai primit : FoarteBine" : (calificativ == "B") ?"Ai primit : Bine":"Ai primit : Suficient";
}

	}


