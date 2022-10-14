package EmployeeDao;

import javax.persistence.EntityManager;
import javax.security.auth.login.AccountException;

import Entities.Employee;
import Exceptions.EmployeeException;
import Utility.EMUtil;

public class EmployeeDaoImp implements EmployeeDao{

	 private static EntityManager em = EMUtil.provideEntityManager();
	
	
	@Override
	public boolean registerEmployee(Employee employee) throws EmployeeException {
		
//		Employee ep = null;
		
		boolean flag = false;
		em.getTransaction().begin();
		em.persist(employee);
		flag = true;
		em.getTransaction().commit();
		em.close();
		
		
		
		if(!flag) throw new EmployeeException("employee is not registered");
		
		return flag;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee ans = null;
	Employee emp =  em.find(Employee.class, empId);
	if(emp == null ) {
		throw new EmployeeException("No employee");
	}else {
		ans = emp;
	}
		return ans;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		boolean flag = false;
		Employee emp =  em.find(Employee.class, empId);
		if(emp != null) {
		em.getTransaction().begin();
		em.remove(emp);
		flag = true;
		em.getTransaction().commit();
		em.close();
		}
		
		return flag;
	}

	@Override
	public boolean updateEmployee(Employee employee) throws EmployeeException {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		em.getTransaction().begin();
		em.merge(employee);
		flag = true;
		em.getTransaction().commit();
		em.close();
		
		return flag;
		
		
	}

}
