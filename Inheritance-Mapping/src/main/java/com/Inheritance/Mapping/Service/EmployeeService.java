package com.Inheritance.Mapping.Service;

import com.Inheritance.Mapping.Entity.ContractEmployee;
import com.Inheritance.Mapping.Entity.Employee;
import com.Inheritance.Mapping.Entity.RegularEmployee;

public interface EmployeeService {

    Employee createEmployee (Employee employee);

    RegularEmployee createRegularEmployee (RegularEmployee employee);

    ContractEmployee createContractEmployee (ContractEmployee employee);

    Employee getEmployeeById (Integer id);

    RegularEmployee getRegularEmployeeById (Integer id);

    ContractEmployee getContractEmployeeById (Integer id);
}
