package EmployeeDao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entities.Department;
import Entities.Employee;
import Exceptions.DepartmentException;
import Exceptions.EmployeeException;
import Util.EMUtil;

public class DaoImpl implements EmployeeDaoInter {

	static EntityManager em = EMUtil.provideConnection();
	@Override
	public void addDepartment(Department dept) {
		// TODO Auto-generated method stub
		
		if(dept != null ) {
		em.getTransaction().begin();
		em.persist(dept);
		em.getTransaction().commit();
		System.out.println("DOne..");
		}
		else {
//			throw new DepartmentException("Department not found");
			System.out.println("sorry");
		}
		
	}
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		if(emp != null ) {
			
			em.getTransaction().begin();
			em.persist(emp);
			em.getTransaction().commit();
			System.out.println("DOne..");
		}else {
			System.out.println("SOrry");
		}
		
	}
	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
		// TODO Auto-generated method stub
		
		
			
			Employee emp = em.find(Employee.class, empId);
			int ids = emp.getEmpId();
			Department dept = em.find(Department.class,deptId);
			
			if(emp == null ) {
				throw new EmployeeException("EMployee not found");
				
			}
			else if(  dept == null ) {
				
				throw new DepartmentException("Department not found");
			}
			
			dept.getList().add(emp);
			em.getTransaction().begin();
			em.persist(dept);
			em.merge(dept);
			em.getTransaction().commit();
			System.out.println("Done..");
			
		
		
	}
	
	
	@Override
	public List<Employee> getAllEmployeeWithDeptName(String   dname) throws EmployeeException {
		// TODO Auto-generated method stub
			List<Employee> emp = new ArrayList<>();
		String jpql = "from Department where deptName = :ids";
		
		Query  q = em.createQuery(jpql);
		q.setParameter("ids", dname);
		
//		List dp = q.getResultList();
		Department dp = (Department) q.getSingleResult();
		
		
		if(dp == null ) {
			throw new EmployeeException("Not found");
		}
		
		List<Employee> list = dp.getList();
		
////		Employee emp =null;
	
//		Department dp = em.find(Department.class, dId);
//		
//		if(dp != null ) {
//			
////		emp.add(dp.getD);
//		 emp.add((Employee) dp.getList());
//			
//			
//		}else {
//			throw new EmployeeException(" not found");
//		}
//		
//		
		return list;
	}

}
