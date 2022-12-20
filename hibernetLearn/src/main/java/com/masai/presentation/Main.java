package com.masai.presentation;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Student;
import com.masai.service.StudentServiceImpl;
import com.masai.service.Studentservice;

import hibernetLearn.EmUtil.EmUtil;

public class Main {
	
	private EntityManager em = EmUtil.provideEntity();
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Walcome to Student Management System");
		
//		while(true) {
			
			System.out.println("Press 1 for add Student ");
			System.out.println("Press 2 for remove Student ");
			System.out.println("Press 3 for update Student marks ");
//			System.out.println("Press 1 for add Student ");
			
			int x = sc.nextInt();
			
			if(x == 1) {
				System.out.println("Enter name ");
				String name = sc.next();
				System.out.println("Enter marks ");
				Integer roll = sc.nextInt();
				System.out.println("Enter state ");
				String state = sc.next();
				System.out.println("Enter city ");
				String city = sc.next();
				System.out.println("Enter pincode ");
				String pin = sc.next();
				
				
				Student st = new Student(name,roll,new Address(state,city,pin));
				
				Studentservice service = new StudentServiceImpl();
//				service.addStudent(st);
				System.out.println( service.addStudent(st) );
				
			}
			if(x == 2) {
				
				System.out.println("Enter roll ");
				Integer roll = sc.nextInt();
				Studentservice service = new StudentServiceImpl();
				
				System.out.println(service.removeStudent(roll));
				
			}
			if(x == 3) {
				System.out.println("Enter roll ");
				Integer roll = sc.nextInt();
				System.out.println("Enter marks ");
				Integer marks = sc.nextInt();
				
				Studentservice service = new StudentServiceImpl();
				
//				service.updateStudentMarks(roll, marks);
					System.out.println( service.updateStudentMarks(roll, marks));	
				
				
			}
//		}
		
		sc.close();
		
	}

}
