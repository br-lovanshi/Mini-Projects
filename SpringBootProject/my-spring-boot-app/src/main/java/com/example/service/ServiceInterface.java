package com.example.service;

import com.example.entity.Student;
import com.example.exception.ResourceNotFoundException;

import java.util.HashMap;

public interface ServiceInterface {

    public Student store(Student student) throws ResourceNotFoundException;
    public Student get(int id) throws Exception;
    public Student update(Student student, int id) throws Exception;
    public String destroy(int id) throws Exception;
}
