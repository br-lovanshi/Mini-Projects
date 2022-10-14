package Jpql;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtil;

public class UpdateSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "update Employee set salary = salary+:bal";
		Query q = em.createQuery(jpql);
		
		q.setParameter("bal", 111);
		
		em.getTransaction().begin();
		int x = q.executeUpdate();
		em.getTransaction().commit();
		System.out.println(x +" Success");
		
	}

}
