package com.masai.service;

import com.masai.model.Student;

public interface Studentservice {

	public String addStudent(Student st );
	public String removeStudent(Integer roll);
	public String updateStudentMarks(Integer roll,Integer marks);
	
}
