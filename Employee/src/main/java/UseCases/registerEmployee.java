package UseCases;

import java.util.Scanner;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Entities.Employee;
import Exceptions.EmployeeException;

public class registerEmployee {

	public static void main(String[] args) throws EmployeeException {
		
		EmployeeDao dao = new EmployeeDaoImp();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter address");
		String address = sc.next();
		System.out.println("Enter salary");
		int salary = sc.nextInt();
		
		Employee emp = new Employee();
		emp.setAddress(address);
		emp.setName(name);
		emp.setSalary(salary);
		
//		System.out.println(emp);
		
		if(dao.registerEmployee(emp)) {
			System.out.println("success");
		}else {
			System.out.println("Sorry");
		}
	}
}
