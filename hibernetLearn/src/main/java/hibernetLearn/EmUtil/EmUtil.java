package hibernetLearn.EmUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {

	
	public static EntityManagerFactory emf;
	
	static {
		
	emf = 	Persistence.createEntityManagerFactory("LearnStudent");
		
	}
	
	public static EntityManager provideEntity() {
		
		return emf.createEntityManager();
	}
}
