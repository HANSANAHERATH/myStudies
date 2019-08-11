package main.java.com.designPatterns.Creational.AbstractFactoryPattern.BankFactory;

import main.java.com.designPatterns.Creational.AbstractFactoryPattern.AbstractFactory;
import main.java.com.designPatterns.Creational.AbstractFactoryPattern.LoanFactory.Loan;

public class BankFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		} else if (bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		return null;
	}

	public Loan getLoan(String loan) {
		return null;
	}
}// End of the BankFactory class.