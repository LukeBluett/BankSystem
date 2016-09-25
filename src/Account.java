/*
 *	This is an interface so that the classes CurrentAccount and SavingsAccount 
 *	can implement
 *
 */

public interface Account {

	public void setAmountToWithdraw();
	public void setAmountToDeposit();
	public double getBalance();
}
