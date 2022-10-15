package usecases;

import java.util.Scanner;

import AccountDao.AccountDao;
import AccountDao.AccountDaoImp;
import AccountEntity.Account;

public class deposit {
	
	static AccountDao dao = new AccountDaoImp();
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		
		int id = sc.nextInt();
		Account ac = dao.findById(id);
		if(ac == null){
			
			System.out.println(" no ac found ");
		}
		else {
			
			System.out.println("Enter amount");
			int amt = sc.nextInt();
			
			ac.setBalance(ac.getBalance()+amt);
			boolean f = dao.update(ac);
			if(f) {
				System.out.println("success");
			}else {
				System.out.println("technical error");
			}
			
		}
		
		
	}
}
