package com.example.controller;

import com.example.entity.Student;
import com.example.entity.StudentDTO;
import com.example.exception.ResourceNotFoundException;
import com.example.service.ServiceImplementation;
import com.example.service.ServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class Controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
    ServiceInterface service = new ServiceImplementation();

    @PostMapping("/store")
    public ResponseEntity<String> store(@RequestBody Student student1) throws ResourceNotFoundException {
        Student st1 = new Student("Brajesh",100);
        Student st= service.store(st1);
        return ResponseEntity.ok("Student created successfully. " +st.toString());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> show(@PathVariable  int id) throws Exception {
        Student student = service.get(id);
        return ResponseEntity.ok(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable int id, @RequestBody StudentDTO studentDTO) throws Exception {
        Student student = new Student(studentDTO.getName(),studentDTO.getMarks());
        Student st = service.update(student,id);
        return new ResponseEntity<>("Student added successfully. " + st.toString(), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> destroy(@PathVariable int id) throws Exception {
        String output = service.destroy(id);
        return ResponseEntity.ok(output);

    }
}
