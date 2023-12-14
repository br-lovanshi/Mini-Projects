package com.service;

import com.exception.StudentException;
import com.model.Student;

import java.util.HashSet;

public interface StudentInterFace {

    public String save(Student student) throws StudentException;
    public String update(int id, Student student) throws StudentException;
    public Student show(int id) throws  StudentException;
    public HashSet<Student> index() throws StudentException;
    public String destroy(int id) throws StudentException;
}
