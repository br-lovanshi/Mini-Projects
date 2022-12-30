package student.main;

import java.util.Scanner;

import student.exception.StudentException;
import student.model.Students;

public class Main {

	public static void main(String[] args) {
		
		    System.out.println("==============");
			System.out.println("Walcome to the Student Mini APP ");
			System.out.println("==============");
		
		Opration opration = new Opration();
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("press 1 to add student ");
			System.out.println("press 2 to remove student ");
			System.out.println("press 3 to update student ");
			System.out.println("press 4 for Exit");
		int x = sc.nextInt();
		
		if( x == 1) {
		System.out.println("eneter roll num ");
		int roll = sc.nextInt();
		System.out.println("enter name ");
		String name = sc.next();
		System.out.println("Enter marks");
		int mark = sc.nextInt();
		
		Students student = new Students(roll,name,mark);
		
		Students demo = opration.addStudent(student);
		System.out.println("==============");
		System.out.println("Roll Num ->  " + demo.getRollNum());
		System.out.println("Name -> " + demo.getStudentName());
		System.out.println("marks -> " + demo.getStudentMarks());
		System.out.println("==============");
		}
		
		else if( x == 2) {
			
			System.out.println("enter the roll num ");
			int roll = sc.nextInt();
			try {
				Students demo = opration.removeStudent(roll);
				System.out.println("==============");
				System.out.println("Roll Num ->  " + demo.getRollNum());
				System.out.println("Name -> " + demo.getStudentName());
				System.out.println("marks -> " + demo.getStudentMarks());
				System.out.println("==============");
				
			}catch (Exception e) {
				// TODO: handle exception
				e.getMessage();
			}
		}
		else if(x == 3) {
			
			System.out.println("enter the roll ");
			int roll = sc.nextInt();
			System.out.println("Enter the gress marks");
			
			int mark = sc.nextInt();
			
			try{
				Students demo = opration.updateStudent(roll, mark);
			System.out.println("==============");
				System.out.println("Roll Num ->  " + demo.getRollNum());
				System.out.println("Name -> " + demo.getStudentName());
				System.out.println("marks -> " + demo.getStudentMarks());
				System.out.println("==============");
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		
		else if(x == 4) {
			
			flag = false;
			System.out.println("Thank you ");
		}
	}
		
	}
}
