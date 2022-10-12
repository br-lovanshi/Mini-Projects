package EmployeeDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import EmployeeEntities.Account;


		
public class Accountimp implements AccountEntities {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
	EntityManager em = emf.createEntityManager();
	
	
	@Override
	public Account findById(int id) {
		// TODO Auto-generated method stub
		Account ac = null;
		Account a = em.find(Account.class, id);
		
		if( a != null ) {
			ac = new Account(a.getId(),a.getEmail(),a.getAddress(),a.getBalance());
			
		}
		return ac;
	}


	@Override
	public String save(Account account) {
		// TODO Auto-generated method stub
		if(account != null ) {
			
		
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
//		em.clear();
//		em.close();
		return "account save";
		}
		
		return "sorry";
	}


	@Override
	public String deleteAccountById(int id) {
		// TODO Auto-generated method stub
		
		if(id != 0 ) {
			
			Account ac = em.find(Account.class, id);
			
			em.getTransaction().begin();
			em.remove(ac);
			em.getTransaction().commit();
			em.close();
			return "account removed";
			}
			
			return "Sorry";
		
//		return null;
	}


	@Override
	public String withdraw(double amount, int accountId) {
		
            if(accountId != 0 ) {
			
			Account ac = em.find(Account.class, accountId);
			
			em.getTransaction().begin();
			
		double am = 	ac.getBalance();
		if(am >= amount) {
			ac.setBalance(ac.getBalance()-amount);
			
		}
			em.getTransaction().commit();
			em.close();
			return "withdraw success";
			}
			
			return "Sorry";
		
		
	}


	@Override
	public String deposit(double amount, int accountId) {
		// TODO Auto-generated method stub
		

        if(accountId != 0 ) {
		
		Account ac = em.find(Account.class, accountId);
		
		em.getTransaction().begin();
		
	
		ac.setBalance(ac.getBalance()-amount);
		
		em.getTransaction().commit();
		em.close();
		return "deposit success";
		}
		
		return "Sorry";
	
	
}
		
	
	

	
}
