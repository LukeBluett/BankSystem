/*
 *	This class contains the concrete implementations for handling
 *	current account transactions 
 *
 */

public class CurrentAccount implements AccountType {

	private int currentAccountNo;
	private double balance;

	public CurrentAccount(int currentAccountNo) {

		this.currentAccountNo = currentAccountNo;
		this.balance = getBalance();
	}

	public void setAmountToWithdraw(double amountToWithdraw) {

		if (amountToWithdraw < (balance * 2)) {
			this.balance -= amountToWithdraw;
		} else {
			System.out.println("Error: You can't take out that much");
		} 
	}

	public void setAmountToDeposit(double amountToDeposit) {

		if (amountToDeposit > 5000) {
			this.balance += amountToDeposit;
		} else {
			System.out.println("Error: You can't put too much in at once");
		}
	}

	public double getBalance() {
		
		if (this.balance == 0) {
			return 1000;
		} else {
			return this.balance;
		}
	}
}
