package AccountDao;

import AccountEntity.Account;

public interface AccountDao {

	
	public Account findById(int id);
	  boolean save(Account account);
	boolean deleteAccountById(int id);
//	boolean withdraw(double amount,int accountId)
//	boolean deposit(double amount,int accountId)
	  boolean update(Account account);
}
