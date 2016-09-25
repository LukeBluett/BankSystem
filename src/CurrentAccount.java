/*
 *	This class contains the concrete implementations for handling
 *	current account transactions 
 *
 */

public class CurrentAccount {

	private int currentAccountNo;
	private double balance;

	public CurrentAccount(int currentAccountNo) {

		this.currentAccountNo = currentAccountNo;
		this.balance = getBalance();
	}

	public void setAmountToWithdraw(double amountToWithdraw) {
		this.balance -= amountToWithdraw;
	}

	public void setAmountToDeposit(double amountToDeposit) {
		this.balance += amountToDeposit;
	}

	public void getBalance() {
		
		if (this.balance == 0) {
			return 1000;
		} else {
			return this.balance;
		}
	}
}
