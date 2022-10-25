package Entities;

import javax.persistence.Entity;

@Entity
public class ContractualEmployee extends Employee{
	
	private int noOfWorkingDays;
	private int costPerDay;
	
	

	public int getNoOfWorkingDays() {
		return noOfWorkingDays;
	}

	public void setNoOfWorkingDays(int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public int getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}
	
	
public ContractualEmployee(int empid, String name, int noOfWorkingDays, int costPerDay) {
		super(empid, name);
		this.noOfWorkingDays = noOfWorkingDays;
		this.costPerDay = costPerDay;
	}

//public ContractualEmployee() {
//		// TODO Auto-generated constructor stub
//	}
//	public ContractualEmployee(int empid, String name, int noOfWorkingDays, int costPerDay) {
//		super(empid, name);
//		this.noOfWorkingDays = noOfWorkingDays;
//		this.costPerDay = costPerDay;
//	}
	
	
	
	
}


