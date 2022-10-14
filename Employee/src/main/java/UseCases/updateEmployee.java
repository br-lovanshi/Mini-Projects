package UseCases;

import java.util.Scanner;

import javax.persistence.EntityManager;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import Entities.Employee;
import Exceptions.EmployeeException;
import Utility.EMUtil;

public class updateEmployee {

	

		public static void main(String[] args) throws EmployeeException {
			EntityManager em = EMUtil.provideEntityManager();
			EmployeeDao dao = new EmployeeDaoImp();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id");
			int id = sc.nextInt();
			
			
			
			Employee employee = em.find(Employee.class, id);
			
			if(employee != null ) {
				
			System.out.println("Enter address");
			String address = sc.next();
			System.out.println("Enter salary");
			int salary = sc.nextInt();
			
			employee.setAddress(address);
			employee.setSalary(salary);
			if(dao.updateEmployee(employee)) {
				
				System.out.println("updated");
			}else {
				System.out.println("try again");
			}
			
			
			}
			
		}
	

}
