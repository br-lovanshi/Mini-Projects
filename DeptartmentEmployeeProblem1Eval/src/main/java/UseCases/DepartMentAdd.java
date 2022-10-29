package UseCases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import EmployeeDao.DaoImpl;
import EmployeeDao.EmployeeDaoInter;
import Entities.Department;
import Exceptions.DepartmentException;
import Util.EMUtil;

public class DepartMentAdd {

	
	public static void main(String[] args) throws DepartmentException {
		
		
		
		EntityManager em  = EMUtil.provideConnection();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Dept name ");
		String n = sc.next();
		System.out.println("Enter Location name ");
		String l = sc.next();
		EmployeeDaoInter dao = new  DaoImpl();
		
		Department dp = new Department();
		
		dp.setDeptName(n);
		dp.setLocation(l);
		
		
		dao.addDepartment(dp);
	}
}
