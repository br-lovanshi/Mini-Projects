package Jpql;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Utility.EMUtil;


import	java.util.List;
public class AllEmployeesSalary {
public static void main(String[] args) {
	
	EntityManager em = EMUtil.provideEntityManager();
	
	String s = "select salary from Employee";
	
	Query q = em.createQuery(s);
	
	List<Integer> list = q.getResultList();
	
	System.out.println(list);
	
}
}
