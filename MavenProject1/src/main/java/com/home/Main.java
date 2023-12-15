package com.home;

import com.exception.StudentException;
import com.model.Student;
import com.service.StudentInterFace;
import com.service.StudentService;
import java.util.Arrays;
import java.util.Set;
public class Main {
    public static void main(String[] args)  {
            System.out.println("Hello");
            System.out.println("Welcome to the main page");

            StudentInterFace crud = new StudentService();
//        Store student
            Student student = new Student(1, "Brajesh", 22, 100, true);
            Student student1 = new Student(2, "Vicky", 23, 100, true);

            String output = null;
            try {
                output = crud.save(student);
            } catch (StudentException e) {
                e.printStackTrace();
            }
            String output1 = null;
            try {
                output1 = crud.save(student1);
            } catch (StudentException e) {
                e.printStackTrace();
            }

            System.out.println(output + "\n" + output1);
//        get student
            Student getStudent = null;
            try {
                getStudent = crud.show(1);
            } catch (StudentException e) {
                e.printStackTrace();
            }
            System.out.println(getStudent);

//        update student
            Student updatedStudent = new Student(1, "Brajesh Lovanshi", 22, 999, true);
            String updateStudent = null;
            try {
                updateStudent = crud.update(1, updatedStudent);
            } catch (StudentException e) {
                e.printStackTrace();
            }
            System.out.println(updateStudent);


//        all students
            Set<Student> allStudents = null;
            try {
                allStudents = crud.index();
            } catch (StudentException e) {
                e.printStackTrace();
            }
            System.out.println(allStudents);

//        remove student
            try {
                String remmoveStudent = crud.destroy(22);
            } catch (StudentException e) {
                System.out.println(e.getMessage());
                String[] data = {Integer.toString(e.getStatusCode()), e.getMessage()};
                System.out.println(Arrays.toString(data));

            }



    }
}
