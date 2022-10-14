package UseCases;

import java.util.Scanner;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Entities.Employee;
import Exceptions.EmployeeException;

public class getById {

	
	public static void main(String[] args) throws EmployeeException {
		
		EmployeeDao dao = new EmployeeDaoImp();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		
		Employee emp = dao.getEmployeeById(id);
		
		System.out.println(emp);
	}
	
}

