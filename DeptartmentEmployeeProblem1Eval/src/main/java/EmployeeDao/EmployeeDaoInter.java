package EmployeeDao;

import java.util.List;

import Entities.Department;
import Entities.Employee;
import Exceptions.DepartmentException;
import Exceptions.EmployeeException;

public interface EmployeeDaoInter {

	
	public void addDepartment(Department dept) ;
	 public void addEmployee(Employee emp);
	 public void registerEmployeeTODepartment(int empId, int deptId)throws
	 EmployeeException, DepartmentException;
	public  List<Employee> getAllEmployeeWithDeptName(String dname)throws
	 EmployeeException;
}
