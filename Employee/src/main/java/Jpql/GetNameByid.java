package Jpql;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtil;

public class GetNameByid {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		String s = "select name from Employee where id = :id";
		
		Query q = em.createQuery(s);
		
		q.setParameter("id", 2);
		String ans = (String)q.getSingleResult();
		System.out.println(ans);
		
	}
}
