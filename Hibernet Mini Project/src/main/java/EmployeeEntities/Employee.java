package EmployeeEntities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empId;
	private String name,address;
	private int salary;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, String address, int salary) {
		super();
		this.empId = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}


	public int getId() {
		return empId;
	}


	public void setId(int id) {
		this.empId = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "EmployeeBeanPojo [id=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
	
	
}

