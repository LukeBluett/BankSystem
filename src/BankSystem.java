/*
 *	This is an abstract Super class that has generic 
 *	information that are shared among similar classes
 *
 */

public abstract class BankSystem {

	private int accountNumber;
	private Withdraw amountToWithdraw;
	private Deposit amountToDeposit;

	public BankSystem() {
	
		this.accountNumber 	= null;
		this.amountToWithdraw 	= null;
		this.amountToDeposit 	= null;
	}

	public void setAccountNumber(int accountNumber) {
	
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
	
		return this.accountNumber;
	}

	public abstract void setAmountToWithdraw(double amountToWithdraw);
	public abstract void setAmountToDeposit(double amountToDeposit);

}
