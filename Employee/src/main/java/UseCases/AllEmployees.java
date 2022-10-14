package UseCases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entities.Employee;
import Utility.EMUtil;


public class AllEmployees {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "from Employee";
		
		Query q = em.createQuery(jpql);
		
		List<Employee> emplist = q.getResultList();
		emplist.forEach(System.out::println);
//		 System.out.println(emplist);
		
		
		
	}
}
