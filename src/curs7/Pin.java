package curs7;

import java.util.Scanner;

public class Pin {
	Scanner scan  =  new Scanner(System.in);
	int pin;
	int DEFAULT_PIN =2244;
	
	public void readPin() {
		System.out.println("Te rog introdu pin ul : ");
		pin = scan.nextInt();
	}
	public void validatePin() {
		int tries=0;
		do {
			readPin();
						if(pin == DEFAULT_PIN) {
				System.out.println("Acces granted");
				break;
			}
		
			else {	
				tries++;
			System.out.println("Wrong PIN");
		}
		}while(tries < 3);

	if (tries == 3) {
		System.out.println("Maximum attempts reached. Card blocked");
	}
}
	
}
