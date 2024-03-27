package curs5;

import java.util.Scanner;

/*
 * facem un program care cere un text de la tastatura
 * cautam in text litera b
 * daca o gasim, printam : Litera B exista in text
 * daca nu o gasim, printam : Litera B nu exista in text
 * 
 * Rezolvare 1:
 * --gasesc litera B printez si ies
 * Rezolvare 2:
 * --printez nr de aparitii ale literei B in text
 * 
 * 
 */

public class LetterSearch {

	public static void main(String[] args) {

		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Please enter a text : ");
		String text =  scan.next().toLowerCase();
		
		
		System.out.println(text.length());
		//masina  -- lungimea este 6
		//012345 6
		//masina --> String
		//masina.charAt(3) == i;
		
		boolean amGasitLiteraB = false;
		int nrAparitii = 0;
		
		for(int i = 0; i < text.length(); i++ ) {
				
			if(text.charAt(i) == 'b' || text.charAt(i) == 'B') {
				//amGasitLiteraB = true;
				//break;
				nrAparitii++;
			}
		}
		
	/*	if(amGasitLiteraB) {  
			System.out.println("Am gasit litera B");
		}else {
			System.out.println("Nu am gasit litera B");
		}*/
		
		//String result = amGasitLiteraB ? "Am gasit litera B" :"Nu am gasit litera B";
		//System.out.println(result);
		
		System.out.println("Nr aparitii litera B : " + nrAparitii );
		
		
		
	}

}