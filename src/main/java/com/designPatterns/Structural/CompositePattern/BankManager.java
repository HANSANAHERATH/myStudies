package main.java.com.designPatterns.Structural.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager implements Employee {
	private int id;
	private String name;
	private double salary;

	public BankManager(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	List<Employee> employees = new ArrayList<Employee>();

	public void add(Employee employee) {
		employees.add(employee);
	}

	public Employee getChild(int i) {
		return employees.get(i);
	}

	public void remove(Employee employee) {
		employees.remove(employee);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void print() {
		System.out.println("==========================");
		System.out.println("Id =" + getId());
		System.out.println("Name =" + getName());
		System.out.println("Salary =" + getSalary());
		System.out.println("==========================");

		Iterator<Employee> it = employees.iterator();

		while (it.hasNext()) {
			Employee employee = it.next();
			employee.print();
		}
	}
}