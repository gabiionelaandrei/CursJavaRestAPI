package curs11;

public class SavingsAccount extends Account{

	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		this.setAccountNumber(accountNumber);
		this.balance = balance;
		this.accountOwner = accountOwner;
	
	}
	
	@Override
	public void withdraw (double sumaRetrasa) throws InsuficientFundsException {
		
		if(sumaRetrasa > balance ) {
			System.out.println("The amount you entered is greater than the available balance: " + balance);
			System.out.println("Thank you for using our ATM!");
			throw new InsuficientFundsException("Insuficient funds for transaction");
			
		}
		else {
			balance=balance-sumaRetrasa;
		}
		System.out.println("Please pick your money!");
		System.out.println("Your new balance is: " + balance);
		System.out.println("Thank you for using our ATM!");
		}
	
		
}
