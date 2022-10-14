package UseCases;

import java.lang.reflect.Executable;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Entities.Employee;
import Utility.EMUtil;

public class GiveBonus {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
//		update all 
//		String jpql = "update Employee set salary = salary+500";
//		
////		
//		Query q = em.createQuery(jpql);
//		
//		em.getTransaction().begin();
//		int x = q.executeUpdate();
//		em.getTransaction().commit();
//		System.out.println(x +  " Row affected!");
		
//		using parameter  
		
		String jpql = "update Employee set salary = salary+:bal where name = :nam";
		
		Query q = em.createQuery(jpql);
		
		q.setParameter("bal", 99);
		q.setParameter("nam", "hari");
		
		em.getTransaction().begin();
		int x = q.executeUpdate();
		em.getTransaction().commit();
		
		System.out.println(x  +" Row affected");
		
		
	}
}
