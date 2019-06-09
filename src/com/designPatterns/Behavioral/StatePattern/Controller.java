package com.designPatterns.Behavioral.StatePattern;

public class Controller {
	static Managemet management;
	static Sales sales;

	private static Connection con;

	public Controller() {
		// TODO Auto-generated constructor stub
		management = new Managemet();
		sales = new Sales();
	}

	public void setManagement() {
		con = management;
	}

	public void setSales() {
		con = sales;
	}

	public void open() {
		con.open();
	}

	public void close() {
		con.close();
	}

	public void update() {
		con.update();
	}
}
