package main.java.com.designPatterns.Creational.SingletonPattern;

public class Singlton {

	private static Singlton obj;

	private Singlton() {
	}

	public static Singlton getObj() {
		if (obj == null) {
			obj = new Singlton();
		}
		return obj;
	}

	public void example() {
		System.out.println("Singleton");
	}
}
