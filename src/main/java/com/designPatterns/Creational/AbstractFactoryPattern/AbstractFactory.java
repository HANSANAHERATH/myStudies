package main.java.com.designPatterns.Creational.AbstractFactoryPattern;

import main.java.com.designPatterns.Creational.AbstractFactoryPattern.BankFactory.Bank;
import main.java.com.designPatterns.Creational.AbstractFactoryPattern.LoanFactory.Loan;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);

	public abstract Loan getLoan(String loan);
}