
package com.masai.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	private String name;
	private Integer marks;
	
	@Embedded
	private Address address;
	public Student( String name, Integer marks, Address address) {
		super();
//		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
//	public Integer getRoll() {
//		return roll;
//	}
//	public void setRoll(Integer roll) {
//		this.roll = roll;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	
}
