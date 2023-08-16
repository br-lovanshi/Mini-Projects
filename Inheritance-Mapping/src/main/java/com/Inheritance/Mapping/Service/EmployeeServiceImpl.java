package com.Inheritance.Mapping.Service;

import com.Inheritance.Mapping.Entity.ContractEmployee;
import com.Inheritance.Mapping.Repository.ContractEmployeeRepo;
import com.Inheritance.Mapping.Repository.EmployeeRepo;
import com.Inheritance.Mapping.Repository.RegularEmployeeRepo;
import com.Inheritance.Mapping.Entity.Employee;
import com.Inheritance.Mapping.Entity.RegularEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo eRepo;
    
    @Autowired
    private ContractEmployeeRepo cRepo;
    
    @Autowired
    private RegularEmployeeRepo rRepo;
    
    @Override
    public Employee createEmployee(Employee employee) {
        return eRepo.save(employee);
    }

    @Override
    public RegularEmployee createRegularEmployee(RegularEmployee employee) {
        return eRepo.save(employee);
    }

    @Override
    public ContractEmployee createContractEmployee(ContractEmployee employee) {
        return eRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return eRepo.findById(id).get();
    }

    @Override
    public RegularEmployee getRegularEmployeeById(Integer id) {
        return rRepo.findById(id).get();
    }

    @Override
    public ContractEmployee getContractEmployeeById(Integer id) {
        return cRepo.findById(id).get();
    }
}
