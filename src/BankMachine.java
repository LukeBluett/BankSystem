/*
 *	This class handles the method of depositing and withdrawing 
 *	from the bank machine
 *
 */

public class BankMachine extends BankSystem {

	public BankMachine(int accountNumber, AccountType accountType) {

		super(accountNumber, accountType);
	}

	public String toString() {
		
		return "\nAccount number: " + getAccountNumber() + "\nBalance: " + getAccountType().getBalance()  + "\n";
	}
}
