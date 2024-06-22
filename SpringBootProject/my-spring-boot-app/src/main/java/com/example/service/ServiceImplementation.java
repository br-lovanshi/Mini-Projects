package com.example.service;

import com.example.Repository.StudentRepository;
import com.example.Repository.TempDatabase;
import com.example.entity.Student;
import com.example.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ServiceImplementation implements ServiceInterface {

    @Autowired
    public StudentRepository studentRepository;

    public Student store(Student student) throws ResourceNotFoundException {
        if (student != null) {
            studentRepository.save(student);
            return student;
        }
        throw new ResourceNotFoundException("Student details are empty.");
    }

    @Override
    public Student get(int id) throws Exception {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isEmpty()) throw new Exception("Student not found.");
        return student.get();
    }

    @Override
    public Student update(Student student, int id) throws Exception {
        Optional<Student> student1 = studentRepository.findById(id);

        student1.ifPresent(st -> {
            st.setName(student.getName());
            st.setMarks(student.getMarks());
            studentRepository.save(st);
        });

        if(student1.isEmpty()){
             throw new Exception("Student not found");
        }
        return student1.get();
    }

    @Override
    public String destroy(int id) throws Exception {
        Optional<Student> optionalStudent = studentRepository.findById(id);

       if(optionalStudent.isEmpty()){
            throw new Exception("Student not found");
        }

        optionalStudent.ifPresent(student -> {
            studentRepository.delete(student);
        });
        return "Student deleted successfully.";
    }
}
