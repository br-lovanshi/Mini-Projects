package EmployeeDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import EmployeeEntities.Employee;


public class EmployeeDaoImp implements EmployeeDao{

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeUnit");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public void save(Employee emp) {
	
	
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
	
		
		System.out.println("Employee saved");
		
		em.close();
		
		
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		
		String s = "Not Found!";
		
		
			
			Employee e = em.find(Employee.class,empId);
			if(e != null ) {
				
				em.getTransaction().begin();
				
				s = e.getAddress();
				
				em.getTransaction().commit();
				
				em.close();
			}
			
		
		
		return s;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		// TODO Auto-generated method stub
		String s = "try again";

		Employee e = em.find(Employee.class,empId);
		
		if(e != null ) {
			
			em.getTransaction().begin();
			
			e.setSalary(e.getSalary()+bonus);
			s = "Bonus is given Successfully";
			
			
			em.getTransaction().commit();
			
			em.close();
		}
		
	
	
	return s;
		
		
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		
		boolean s = false;

		Employee e = em.find(Employee.class,empId);
		
		if(e != null ) {
			
			em.getTransaction().begin();
			
			em.remove(e);
			s = true;
			
			
			em.getTransaction().commit();
			
			em.close();
		}
		
	
	
	return s;
		
	}
	
	

	
	
	
}
