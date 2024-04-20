package curs5;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("How many temperatures do you want to convert?");
		int nrTemperatura = scan.nextInt();
		
		for(int i=0; i< nrTemperatura; i++) {
			System.out.println("What temperature do you want to be set?  ");
			double temperatura = scan.nextDouble();
			double tempF =temperatura*9/5+32;
			System.out.println("The temperature in F is: " +  tempF);
		}
	}

}
