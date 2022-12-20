package com.masai.service;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Student;

import hibernetLearn.EmUtil.EmUtil;

public class Demo {

	
	public static void main(String[] args) {
		
		EntityManager em = EmUtil.provideEntity();
		Address ad = new Address("MP","Indore","450117");
//		Student st = new Student( "Brajesh", 100, ad);
		
		Student st1 = em.find(Student.class, 1);
		if(st1 != null ) {
			em.getTransaction().begin();
		    st1.setMarks(st1.getMarks()+1111);
			em.getTransaction().commit();
			em.close();
			System.out.println("Mark's is updated");
		}else {
			System.out.println("st1 is not found!");
		}
//	   em.getTransaction().begin();
//	   em.find();
//	   em.getTransaction().commit();
//	   System.out.println("Done...");
//	   em.close();
	}
}
