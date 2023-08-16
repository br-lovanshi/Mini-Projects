package com.Inheritance.Mapping.Controller;

import com.Inheritance.Mapping.Entity.ContractEmployee;
import com.Inheritance.Mapping.Entity.Employee;
import com.Inheritance.Mapping.Entity.RegularEmployee;
import com.Inheritance.Mapping.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService eSer;

    @PostMapping("/")
    public ResponseEntity<Employee> createEmployeeHandler(@RequestBody Employee employee){
        return new ResponseEntity<>(eSer.createEmployee(employee), HttpStatus.CREATED);
    }

    @PostMapping("/regular")
    public ResponseEntity<Employee> createRegularEmployeeHandler(@RequestBody RegularEmployee employee){
        return new ResponseEntity<>(eSer.createRegularEmployee(employee), HttpStatus.CREATED);
    }

    @PostMapping("/contract")
    public ResponseEntity<Employee> createContractEmployeeHandler(@RequestBody ContractEmployee employee){
        return new ResponseEntity<>(eSer.createContractEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeByIdHandler (@PathVariable("id") Integer id){
        return new ResponseEntity<>(eSer.getEmployeeById(id), HttpStatus.OK);
    }

    @GetMapping("/regular/{id}")
    public ResponseEntity<Employee> getRegularEmployeeByIdHandler (@PathVariable("id") Integer id){
        return new ResponseEntity<>(eSer.getRegularEmployeeById(id), HttpStatus.OK);
    }

    @GetMapping("/contract/{id}")
    public ResponseEntity<Employee> getContractEmployeeByIdHandler (@PathVariable("id") Integer id){
        return new ResponseEntity<>(eSer.getContractEmployeeById(id), HttpStatus.OK);
    }
}
