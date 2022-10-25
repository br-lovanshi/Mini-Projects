package Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("PersonUnit");
	}
	
	public static EntityManager provideEntityManager() {
		 
		 return emf.createEntityManager();
	 }
}
