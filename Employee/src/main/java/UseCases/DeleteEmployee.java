package UseCases;

import java.util.Scanner;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Exceptions.EmployeeException;

public class DeleteEmployee {

	public static void main(String[] args) throws EmployeeException {
		EmployeeDao dao = new EmployeeDaoImp();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		
		if(dao.deleteEmployeeById(id)) {
			System.out.println("Emp deleted");
		}else {
			System.out.println("try letter");
		}
	}
}

