package curs3;

import java.util.Scanner;

public class PunctajTest {

	public static void main(String[] args) {
		int punctaj; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your score :");
		punctaj = scan.nextInt();	
	
 if (punctaj >=0 && punctaj <=65) {
	 System.out.println("Ai picat. Mai incearca.");
 }
 else if(punctaj >=66){
	 System.out.println("Felicitari, Ai trecut.");
 }
}
}