/*
 *	This is an abstract Super class that has generic 
 *	information that are shared among similar classes
 *
 */

public abstract class BankSystem {

	private int accountNumber;
	private AccountType accountType;

	public BankSystem(int accountNumber, AccountType accountType) {
	
		this.accountNumber 	= accountNumber;
		this.accountType	= accountType;
	}

	public void setAccountNumber(int accountNumber) {
	
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
	
		return this.accountNumber;
	}

	public void setAccountType(AccountType accountType) {
	
		this.accountType = accountType;
	}

	public AccountType getAccountType() {
	
		return accountType;
	}
}
