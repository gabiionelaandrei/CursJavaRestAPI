package curs6;
/*
 * facem un program care calculeaza salariul pe o saptamana
 * intrebam utilizatorul cate ore a lucrat
 * calculam doar daca a lucrat maxim 40 si minim 1
 * daca introduce un numar invalid il rugam sa introduca din nou
 * facem asta pana introduce un numar valid
 * 
 * calculam cu formula:
 * Salariu = nr ore lucrate * rate pe hour
 * ratePerHour = 35
 * 
 */

import java.util.Scanner;

public class CalculSalarial {

	static final int RATE_PER_HOUR = 35;
	
	public static void main(String[] args) throws InterruptedException  {

		Scanner scan = new Scanner(System.in);
		System.out.println("Cate ore ai lucrat?");
		int oreLucrate = scan.nextInt();

		
		while(oreLucrate <1 || oreLucrate >40) {
			System.out.println("Nr invalid. Introdu numarul de ore:");
			oreLucrate = scan.nextInt();
		}
		System.out.println("Salariul tau este : " + oreLucrate*RATE_PER_HOUR);
		
		
	/*	int i = 3;
		while(i > 0) {		
			System.out.println("Programul se inchide in " + i + " secunde!");
			Thread.sleep(1000);
			i--;
		}*/
		
		for(int i =3; i>0; i--) {
			System.out.println("Programul se inchide in " + i + " secunde!");
			Thread.sleep(1000);
		}
		
		
		/*for(oreLucrate = scan.nextInt(); oreLucrate < 1 || oreLucrate >40 ; oreLucrate = scan.nextInt()) {
			
			System.out.println("Nr invalid. Introdu numarul de ore:");

		}
		System.out.println("Nr invalid. Introdu numarul de ore:");*/

	/*	
		if(oreLucrate <=40 || oreLucrate >= 1) {
			System.out.println("Salariul tau este : " + oreLucrate*RATE_PER_HOUR);
			break;

		}else {
			System.out.println("Nr invalid. Introdu numarul de ore:");
			oreLucrate = scan.nextInt();
			
		}*/
	}

}