package AccountDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import AccountEntity.Account;

public class AccountDaoImp implements AccountDao {

	static EntityManager em = EMUtil.provideEntityManager();
	
	@Override
	public Account findById(int id) {
		
		 
		return em.find(Account.class, id);
	}

	@Override
	public boolean save(Account account) {
		
		boolean isCreate = false;
		
		em.getTransaction().begin();
		em.persist(account);
		isCreate = true;
		em.getTransaction().commit();
		em.close();
		
		return isCreate;
		
		
	}

	@Override
	public boolean deleteAccountById(int id) {
		
		Account ac = em.find(Account.class, id);
		if(ac != null ) {
			
			em.getTransaction().begin();
			em.remove(ac);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Account account) {
		
		boolean flag = false;
		
		Account ac = em.find(Account.class, account.getId());
		
		
			
			em.getTransaction().begin();
			em.merge(ac);
			flag = true;
			em.getTransaction().commit();
			em.close();
			
		
		
		return flag;
		
	}

	

	
	
}
