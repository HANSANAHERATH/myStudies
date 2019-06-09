package main.java.com.designPatterns.Behavioral.StatePattern;

public class SatateDemo {

	Controller controller;

	public SatateDemo(String state) {
		// TODO Auto-generated constructor stub
		controller = new Controller();

		if (state.equals("Management")) {
			controller.setManagement();
		}
		if (state.equals("Sales")) {
			controller.setSales();
		}
		controller.open();
		controller.update();
		controller.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SatateDemo("Management");
	}

}
