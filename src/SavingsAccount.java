/*
 *	This class contains the concrete implementations for handling
 *	savings account transactions
 *
 */

public class SavingsAccount implements Account {

	private int savingsAccountNo;
	private double balance;

	public SavingsAccount(int savingsAccountNo) {

		this.savingsAccountNo = savingsAccountNo;
		this.balance = getBalance();
	}

	public void setAmountToWithdraw(double amountToWithdraw) {
	
		this.balance -= amountToWithdraw;
	}

	public void setAmountToDeposit(double amountToDeposit) {
	
		this.balance += amountToDeposit;
	}

	public double getBalance() {
	
		if (this.balance == 0) {
			return 10000;
		} else {
			return this.balance;
		}
	}
}
