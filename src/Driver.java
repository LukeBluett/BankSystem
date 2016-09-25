/*
 *	This Program runs banking application
 *
 */

public class Driver {

	public static void main(String [] args) {
	
		int userAccountNumber = 22;
		BankMachine bM;
		bM = new BankMachine(userAccountNumber, new CurrentAccount(userAccountNumber));

		System.out.println(bM.toString());
	}
}
