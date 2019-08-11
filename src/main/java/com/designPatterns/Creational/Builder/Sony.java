package main.java.com.designPatterns.Creational.Builder;

public class Sony extends Company {
	@Override
	public int price() {
		return 20;
	}

	@Override
	public String pack() {
		return "Sony CD";
	}
}