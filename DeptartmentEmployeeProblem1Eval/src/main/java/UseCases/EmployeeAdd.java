package UseCases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import EmployeeDao.DaoImpl;
import EmployeeDao.EmployeeDaoInter;
import Entities.Employee;
import Util.EMUtil;

public class EmployeeAdd {

	
	
	public static void main(String[] args) {
		

		EntityManager em  = EMUtil.provideConnection();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp name ");
		String n = sc.next();
		System.out.println("Enter salary");
		int l = sc.nextInt();
		
		EmployeeDaoInter dao = new  DaoImpl();
		
		
		Employee emp = new Employee();
		
		
		emp.setEmpName(n);
		emp.setSalary(l);
	
		
		dao.addEmployee(emp);
	}
}
