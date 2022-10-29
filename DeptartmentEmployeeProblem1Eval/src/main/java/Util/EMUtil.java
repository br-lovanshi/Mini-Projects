package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf;
	
	 static {
		emf = Persistence.createEntityManagerFactory("DeptEmpUnit");
	}
	 
	 public static EntityManager provideConnection() {
		 
		 return emf.createEntityManager();
	 }
}
