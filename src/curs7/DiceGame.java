package curs7;
/*
 * facem un joc de zaruri care simuleaza un joc de zaruri
 * avem urmatoarele reguli:
 * 1.daca userul da in total 2 sau 6 sau 12 --> pierde jocul
 * 2.daca userul da in total: 7 sau 11 --> castiga jocul
 * 3.daca userul da in total: 3 sau 10 --> repeta automat aruncarea
 * 4.daca userul da in total orice alta varianta decat cele de mai sus, il intrebam daca vrea sa mai dea odata
 * raspunsul lui va fi un true sau false
 * 
*/

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		boolean raspuns =true;
		
		while(raspuns) {
			int zar1 = (int) (Math.random() *6 +1);
			int zar2 = (int) (Math.random() *6 +1);
			int total = zar1+zar2;
			System.out.println("Ai dat: " + total);
			if(total == 2 || total ==6 || total ==12) {
				System.out.println("Ai dat " + total + " ! Ai pierdut jocul! ");
				break;
			}
			else if(total == 7 || total ==11) {
				System.out.println("Ai dat " + total + " ! Ai castigat jocul! ");
				break;
			}
			else if(total == 3 || total ==10) {
				System.out.println("Ai dat " + total + " ! Automat mai dai odata! ");
				continue;
			}
			System.out.println("Mai vrei sa dai odata? ");
			raspuns= scan.nextBoolean();
		}
		System.out.println("Game over!");
	}

}
