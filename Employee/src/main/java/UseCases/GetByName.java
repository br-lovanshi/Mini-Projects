package UseCases;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Entities.Employee;
import Utility.EMUtil;
import antlr.collections.List;

public class GetByName {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
//		
//		String s = "from Employee where name = 'hari'";
//		
//		Query q = em.createQuery(s);
//	
////		for single result 
////		Object obj = q.getSingleResult();
////		Employee emObj = (Employee) obj;
////		System.out.println(emObj);
//		
////		for multiple 
//			
//		java.util.List<Employee> list = q.getResultList();
//
//		System.out.println(list);
		
		
		String s = "from Employee where name = 'hari'";
		
		
		TypedQuery<Employee> tq = em.createQuery(s,Employee.class);
		
		Object obj = tq.getSingleResult();
		
		System.out.println(obj);
		
	}
	
}
