package main.java.com.designPatterns.Creational.AbstractFactoryPattern.LoanFactory;

import main.java.com.designPatterns.Creational.AbstractFactoryPattern.AbstractFactory;
import main.java.com.designPatterns.Creational.AbstractFactoryPattern.BankFactory.Bank;

public class LoanFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		return null;
	}

	public Loan getLoan(String loan) {
		if (loan == null) {
			return null;
		}
		if (loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("Business")) {
			return new BussinessLoan();
		} else if (loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}
		return null;
	}

}