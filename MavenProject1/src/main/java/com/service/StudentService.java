package com.service;

import com.exception.StudentException;
import com.model.Student;
import com.storage.DataStorage;
import java.util.HashSet;

public class StudentService implements StudentInterFace {

//    hasSet to store student
    HashSet<Student> store = DataStorage.storeStudent;

    public String save(Student student) throws StudentException {

        for (Student student1 : store) {
            if (student1.getId() == student.getId()) {
                throw new StudentException(404,"Student alraedy exists.");
            }
        }
            store.add(student);
            return "Student added successfully";
    }
    public String update(int id, Student student) throws StudentException {
        boolean found = false;
        for(Student student1 : store){
            if(student1.getId() == id){
                store.remove(student1);
                store.add(student);
                found = true;
                break;
            }
        }
        if(!found) throw new StudentException(404,"Student not found.");
        return "Student updated successfully.";

    }

    public Student show(int id) throws StudentException {
        Student st = null;
        for(Student student:store){
            if(student.getId() == id){
                st = student;
            }
        }
        if(st == null) throw  new StudentException(404,"Student not found.");
        return st;
    }

    public HashSet<Student> index() throws StudentException {
        if(store == null) throw new StudentException(404,"Student not found.");
        return store;
    }

    public String destroy(int id) throws StudentException {
        boolean found = false;
        for(Student student : store){

            if(student.getId() == id){
                store.remove(student);
                found = true;
                break;
            }
        }
        if(!found) throw new StudentException(404,"Student not found.");
        return "Student Deleted Successfully.";

    }
}
