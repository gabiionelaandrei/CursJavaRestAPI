package curs3;

import java.util.Scanner;

public class VerificareVarsta {
 int an;
 
	public void askAboutAge() {
		Scanner obj =  new Scanner(System.in);
		System.out.println("Please enter your age:");
		an = obj.nextInt();
	}
}
