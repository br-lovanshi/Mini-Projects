//package Usecases;
//
//import javax.persistence.EntityManager;
//
//import Entities.Address;
//import Entities.Employee;
//import Entities.Person;
//import Utility.EMUtil;
//
//public class AddALlEmp {
//
//	public static void main(String[] args) {
//		
//		EntityManager em = EMUtil.provideEntityManager();
//			Address ad = new Address("MP","INdore","9393");
//		Address ad1 = new Address("MP","bhopal","89393");
//		
//		
//		em.getTransaction().begin();
//		em.persist(emp);
//		em.persist(ad1);
//		em.persist(ad);
//		em.getTransaction().commit();
//		System.out.println("Done");
//		
//		
//	}
//}
