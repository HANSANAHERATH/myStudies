package main.java.com.designPatterns.Creational.FactoryMethodPattern;

public class PlanFactory {

	public static Plan getPlan(String planType) {

		if (planType.equals("domestic")) {
			return new DomesticPlan();
		} else if (planType.equals("comercial")) {
			return new CommersialPlan();
		}

		return null;
	}
}
