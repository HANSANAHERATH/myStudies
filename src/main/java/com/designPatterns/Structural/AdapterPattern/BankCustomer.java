package main.java.com.designPatterns.Structural.AdapterPattern;

public class BankCustomer extends BankDetails implements CreditCard {

	public void giveBankDetails() {
		// TODO Auto-generated method stub
		int accNumber = 1001;
		String accHolderName = "hansana";

		setAccHolderName(accHolderName);
		setAccNumber(accNumber);
	}

	public String getCreditCard() {
		// TODO Auto-generated method stub

		String accHolderName = getAccHolderName();
		int accNumber = getAccNumber();

		return accHolderName + " have account in our bank. Account number is "
				+ accNumber;
	}
	// Adapter

}
