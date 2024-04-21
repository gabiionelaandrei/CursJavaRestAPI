package curs11;

public class Account {
	private int accountNumber;
	public double balance;
	public Customer accountOwner;
	
	public int getAcountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Customer getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner;
	}

	public void withdraw (double sumaRetrasa) throws InsuficientFundsException {
			throw new InsuficientFundsException("Insuficient funds for transaction");
	}
}
