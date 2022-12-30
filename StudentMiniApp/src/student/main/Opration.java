package student.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import student.exception.StudentException;
import student.model.Students;

public class Opration {

	 List<Students> studentList = new ArrayList<>();
	
//	Set<Students> studentList = new HashSet<>();
	
	public Students addStudent(Students student)  {
		
		studentList.add(student);
		
//		 return "Student added of roll num " + st.getRollNum();
		
		return student;
	}
	
	public Students removeStudent(int rollNum )throws StudentException {

		
		Students studentForRemove = null;
		
			for(int i = 0;i<studentList.size();i++) {
				
				studentForRemove = studentList.get(i);
				
				if(studentForRemove.getRollNum() == rollNum) {
				
					studentList.remove(i);
				}
				
				
			
		}
	
			if(studentForRemove== null ) {
				throw new  StudentException("Student is not present of roll " + rollNum);
			}
			else
//			return "Student is removed of roll " + rollNum;
				return studentForRemove;
	
		
	}
	
	public Students updateStudent (int roll,int gressMarks)throws StudentException {
		
		Students studentforUpdate = null;

		for(int i = 0;i<studentList.size();i++) {
			
			studentforUpdate = studentList.get(i);
			
			if(studentforUpdate.getRollNum() == roll) {
				
				studentforUpdate.setStudentMarks(studentforUpdate.getStudentMarks()+gressMarks);
			}
		}
		if(studentforUpdate == null ) {
			throw new  StudentException("Student is not present of roll " + roll);
		}
		else
		
//		return "Marks is updated of student roll -> " + roll;
			return studentforUpdate;
	}
}
