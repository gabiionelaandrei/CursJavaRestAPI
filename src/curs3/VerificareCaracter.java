package curs3;

import java.util.Scanner;

public class VerificareCaracter {
	
	// masina    "a"   'a'
	// 012345	  0	
	
	
	char character;
	
	public void askTheUserForACharacter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character :");
		character = scan.next().charAt(0);	
		
	}
	
	public void verificaDacaCaracterulEsteLitera() {
		askTheUserForACharacter();
		
		if(Character.isLetter(character)) {
			System.out.println("Caracterul este litera");
		}else {
			System.out.println("Caracterul nu este litera");
		}
		
		
	}
	
	
	
}