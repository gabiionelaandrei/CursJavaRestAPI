package curs7;

import java.util.Scanner;

/*
 * 
 *  validez daca un username nu este null si nu este mai mic decat 6
 *  daca nu respecta cer din nou
 * 
 */
public class DoWhileExample3 {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		System.out.println("Introdu un username:");
		String username = scan.next();
		
		while(username.equals(null) || username.length() <6) {
			
			System.out.println("Introdu un username:");
			username = scan.next();
		}
		
		System.out.println("-------------------------------------------");
		
		String username2;
		
		do {
			
			System.out.println("Introdu un username:");
			username2 = scan.next();
			
		}while(username2.equals(null) || username2.length() <6);
		
	}

}