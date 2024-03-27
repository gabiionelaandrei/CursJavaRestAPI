package curs5;
/*
 * facem un program care calculeaza impozitul pe venit
 * reguli:
 * Intreabam nr surselor de venit
 * Pentru fiecare sursa de venit calculam dupa cum urmeaza
 * daca venit <= 50000 impozit este 0.1 altfel impozit este 0.15
 * 
 * Printam impozitul total
 * 
 */

import java.util.Scanner;

public class CalculImpozitTotal {

	final static int PRAG_VENIT = 50000;
	
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Introdu numarul de venituri :");
		int numarVenituri =  scan.nextInt();
		
		double impozitTotal = 0;
		
		for(int i = 1; i<= numarVenituri; i++) {
			
			System.out.println("Introdu venitul nr " + i);
			double venit = scan.nextDouble();
			
			
			if(venit <=PRAG_VENIT) {
				impozitTotal = impozitTotal + venit * 0.1;
			}else {
				impozitTotal = impozitTotal + venit * 0.15;
			}
		}
		
		System.out.println("Impozit total de plata este: " + impozitTotal);
		

	}

}