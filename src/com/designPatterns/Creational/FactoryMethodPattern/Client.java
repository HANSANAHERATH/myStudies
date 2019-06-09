package com.designPatterns.Creational.FactoryMethodPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String planType = "domestic";

		Plan p = PlanFactory.getPlan(planType);
		p.rate();
	}

}
