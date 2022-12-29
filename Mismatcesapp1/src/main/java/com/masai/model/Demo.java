package com.masai.model;

import javax.persistence.EntityManager;

import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {
	
		EntityManager em= EMUtil.provideEntityManager();
		
		
		Employee emp = new Employee();
		
		emp.setEname("Ram");
		emp.setSalary(85000);
		emp.getAddresses().add(new Address("St1", "C1", "p1","Home"));
		emp.getAddresses().add(new Address("St2", "C2", "p2","Office"));
		
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		
		System.out.println("done");
		
		
		
		em.close();
	}

}
