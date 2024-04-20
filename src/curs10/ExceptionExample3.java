package curs10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample3 {

	public static void main(String[] args) {

		try {
			Scanner scan  = new Scanner(System.in);
			System.out.println("Enter number 1 :");
			int number1 =  scan.nextInt();
			System.out.println("Enter number 2 :");
			int number2 =  scan.nextInt();
			number2 =  (Integer) null;
			System.out.println("Rezultatul impartirii este : " + number1/number2);
		
		}catch(ArithmeticException e) {
			System.out.println("Nu mai imparti la zero ca nu merge");
		}catch (InputMismatchException e) {
			System.out.println("Nu mai introduce caractere ca nu merge");
		}catch(NullPointerException e) {
			System.out.println("A aparut null pointer");
		}catch (Exception e) {
			System.out.println();
		}
		
		
	}

}