package com.masai.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Student;

import hibernetLearn.EmUtil.EmUtil;

public class StudentServiceImpl implements Studentservice {

	private EntityManager em = EmUtil.provideEntity();
	@Override
	public String addStudent(Student st) {
		// TODO Auto-generated method stub
		if(st != null ) {
		em.getTransaction().begin();
		em.persist(st);
		em.getTransaction().commit();
		em.close();
		return "student add Successfully";
		}
		else return "student Object is null";
	}

	@Override
	public String removeStudent(Integer roll) {
		// TODO Auto-generated method stub
	Student st = em.find(Student.class, roll);
	if(st != null ) {
		em.getTransaction().begin();
		em.remove(st);
		em.getTransaction().commit();
		em.close();
		return "Student remove Successully";
		
	}
		return "student is not found! of roll -> " + roll;
	}

	@Override
	public String updateStudentMarks(Integer roll,Integer marks ) {
		// TODO Auto-generated method stub
		
		Student st1 = em.find(Student.class, roll);
		if(st1 != null ) {
			
			em.getTransaction().begin();
			st1.setMarks(st1.getMarks() + marks);
			
			em.getTransaction().commit();
			em.close();
			
			return "Marks updated of Student roll -> " + roll;
		}
		return "Student is Not found!";
		
	}

}
