package Entities;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
public class Employee {

	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int empId;
	private String empName;
	private int salary;
//	@Embedded
//	@ElementCollection(fetch =  FetchType.EAGER)
//	private Address address;
	
	@ManyToOne( cascade = CascadeType.ALL)
	@JoinColumn(name = "did")
	private Department dept;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

//	public Address getAddress() {
//		return address;
//	}

//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee(int empId, String empName, int salary, Address address, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
//		this.address = address;
		this.dept = dept;
	}
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept + "]";
	}

//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address
//				+ ", dept=" + dept + "]";
//	}
	
	
	
	
}
