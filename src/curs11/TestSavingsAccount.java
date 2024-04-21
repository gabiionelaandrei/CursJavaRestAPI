package curs11;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsuficientFundsException {
		Scanner scan = new Scanner(System.in);
		
		Customer client1 = new Customer();
		client1.setName("Ionut");
		SavingsAccount savingsAccount1 = new SavingsAccount(123,10589.66,client1);
		
		System.out.println("Hi " + client1.getName() + " !");
		System.out.println("Please enter the amount to widraw : ");
		double sumaRetrasa = scan.nextDouble();
		savingsAccount1.withdraw(sumaRetrasa);
	}

}
