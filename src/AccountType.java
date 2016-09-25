/*
 *	This is an interface so that the classes CurrentAccount and SavingsAccount 
 *	can implement
 *
 */

public interface AccountType {

	public void setAmountToWithdraw(double amountToWithdraw);
	public void setAmountToDeposit(double amountToDeposit);
	public double getBalance();
}
