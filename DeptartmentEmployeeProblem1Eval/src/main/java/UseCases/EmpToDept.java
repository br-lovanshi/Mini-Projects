package UseCases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import EmployeeDao.DaoImpl;
import EmployeeDao.EmployeeDaoInter;
import Exceptions.DepartmentException;
import Exceptions.EmployeeException;
import Util.EMUtil;

public class EmpToDept {

	public static void main(String[] args) throws EmployeeException, DepartmentException {
		
		
		
		EntityManager em  = EMUtil.provideConnection();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Dept id ");
		int n = sc.nextInt();
		System.out.println("Enter emp id ");
		int l = sc.nextInt();
		
		
		EmployeeDaoInter dao = new DaoImpl();
		dao.registerEmployeeTODepartment(l, n);
	}
}
