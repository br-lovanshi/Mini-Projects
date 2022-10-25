package Entities;

import javax.persistence.Entity;

@Entity
public class SalariedEmployee extends Employee{
	
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public SalariedEmployee(int empid, String name, int salary) {
		super(empid, name);
		this.salary = salary;
	}
//	public SalariedEmployee() {
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + "]";
	}
	
	
	
	
	
}