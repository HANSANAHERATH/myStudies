package main.java.com.designPatterns.Creational.AbstractFactoryPattern;

import main.java.com.designPatterns.Creational.AbstractFactoryPattern.BankFactory.BankFactory;
import main.java.com.designPatterns.Creational.AbstractFactoryPattern.LoanFactory.LoanFactory;

public class FactoryCreator {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Bank")) {
			return new BankFactory();
		} else if (choice.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}
		return null;
	}
}