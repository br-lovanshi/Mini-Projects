package UseCases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import EmployeeDao.AccountEntities;
import EmployeeDao.Accountimp;
import EmployeeEntities.Account;


public class Main {
	 static AccountEntities dao = new Accountimp();
	public static void main(String[] args) throws NumberFormatException, IOException {
		
     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
     while(true) {
		System.out.println("Eneter 1 for get byId");
		System.out.println("Eneter 2 for savenew ");
		System.out.println("Eneter 3 for delete");
		System.out.println("Eneter 4 for withdraw");
		System.out.println("Eneter 5 for deposit");
		try {
		int x = Integer.parseInt(bf.readLine());
		switch (x) {
		case 1:
			System.out.println("Inter the id");
			
			int id = Integer.parseInt(bf.readLine().trim());
			
			Account ans =  dao.findById(id);
			
			System.out.println(ans);
			break;
			
		case 2 : 
			System.out.println("Inter the id");
			
			
			int ids1 = Integer.parseInt(bf.readLine().trim());
			
			System.out.println("Enter email");
			
			String em = bf.readLine();
			System.out.println("Enter address");
			String add = bf.readLine();
			System.out.println("Enter amoutn");
			Double amt = (double) Integer.parseInt(bf.readLine().trim());
			 
			Account ac = new Account(ids1,em,add,amt);
			 String ans1 =  dao.save(ac);
			
			System.out.println(ans1);
			break;
			
		case 3 :
			System.out.println("Inter the id");
			
			
			int id2 = Integer.parseInt(bf.readLine().trim());
			
			 
			
			
			String ans2 =  dao.deleteAccountById(id2);
			
			System.out.println(ans2);
			break;
		case 4 :
			System.out.println("Inter the amnt");
			
			
			int amt1 = Integer.parseInt(bf.readLine().trim());
			
 		 
			System.out.println("Inter the id");
			
			
			int id4 = Integer.parseInt(bf.readLine().trim());
			
			 
//			Account ac = new Account(100, "ab@", "Mp", 23939);
			
			String ans4 =  dao.withdraw(amt1, id4);
			
			System.out.println(ans4);
			break;
		case 5 :
System.out.println("Inter the amnt");
			
			
			int amt5 = Integer.parseInt(bf.readLine().trim());
			
 		 
			System.out.println("Inter the id");
			
			
			int id5 = Integer.parseInt(bf.readLine().trim());
			
			 
//			Account ac = new Account(100, "ab@", "Mp", 23939);
			
			String and5 =  dao.deposit(amt5, id5);
			
			System.out.println(and5);
			break;
		
		default : System.out.println("invalid input");
		
		}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}}
		
	
}
