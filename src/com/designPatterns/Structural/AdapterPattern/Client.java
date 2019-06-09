package com.designPatterns.Structural.AdapterPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard target = new BankCustomer();
		target.giveBankDetails();

		System.out.println(target.getCreditCard());

	}

}
