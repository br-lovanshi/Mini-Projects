package UseCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import EmployeeDao.DaoImpl;
import EmployeeDao.EmployeeDaoInter;
import Entities.Employee;
import Exceptions.EmployeeException;
import Util.EMUtil;

public class GetEmployee {

	public static void main(String[] args) throws EmployeeException {
		
		
EntityManager em  = EMUtil.provideConnection();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Dept name ");
		String n = sc.next();
		
		
		EmployeeDaoInter dao = new DaoImpl();
		
		List<Employee> emp = new ArrayList<>();
		
		emp.addAll(dao.getAllEmployeeWithDeptName(n));
		
		System.out.println(emp);
	}
}
