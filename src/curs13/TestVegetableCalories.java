package curs13;

import java.util.Scanner;

public class TestVegetableCalories {

	public static void main(String[] args) {
Scanner scan  = new Scanner(System.in);
		
		System.out.println("Please enter the vegetable that you want to buy: ");
		String vegetable = scan.next().toString();
		VegetablePropertiesFile leg = new VegetablePropertiesFile();
		leg.writePropertiesFile();
		String response = leg.readPropertiesFile(vegetable);
		//daca exista
		System.out.println(response);
		
		//daca nu exista
		
		do {
			vegetable = scan.next().toString();
			response = leg.readPropertiesFile(vegetable);
			System.out.println(response);
		}
		while(response.equals("Nu vindem aceasta leguma. Te rog alege o alta leguma."));
		   
scan.close();		
	}
	
}
