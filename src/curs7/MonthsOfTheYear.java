package curs7;

import java.util.Arrays;
import java.util.Scanner;

public class MonthsOfTheYear  {
	Scanner scan  =  new Scanner(System.in);
	int nrLuna;
	String[] monnths=new String[]{"Ianuarie","Februarie","Martie","Aprilie","Mai",
			"Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
	
	public void readMonth() {
		System.out.println("Ce luna vrei sa fie afisata? ");
		nrLuna = scan.nextInt();
	}
	public void validateMonth() {
		do {
			readMonth();

			if(nrLuna < monnths.length && nrLuna > 0) {
				System.out.println("Luna aleasa de tine este: " + monnths[nrLuna-1]);
				break;
	}	
			else {	
			System.out.println("Numarul lunii introdus este invalid. Te rog sa alegi un numar intre 1 si 12.");
		}
		}while(nrLuna > monnths.length);


}
	
}
