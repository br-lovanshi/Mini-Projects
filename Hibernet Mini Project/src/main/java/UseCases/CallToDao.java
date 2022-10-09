package UseCases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import EmployeeDao.EmployeeDao;
import EmployeeDao.EmployeeDaoImp;
import EmployeeEntities.Employee;


public class CallToDao {
	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	static EmployeeDao dao = new EmployeeDaoImp();
		
public static void callForSave() throws NumberFormatException, IOException {

	

      System.out.println("Enter emp id");
      
      
      
     int id = Integer.parseInt(bf.readLine().trim());
     
     System.out.println("Enter emp name");
          
     String name = bf.readLine().trim().replaceAll(" ", "");
     System.out.println("Enter emp address");
     
     String address = bf.readLine().trim().replaceAll(" ", "");
     System.out.println("Enter salary");
     
     int salary = Integer.parseInt(bf.readLine().trim());
     
     
	Employee emp = new Employee(id,name,address,salary);
	
	
	
	dao.save(emp);
		
}
	
	public static void getAddress() throws NumberFormatException, IOException {
		

	      System.out.println("Enter emp id");
	      
	      
	      
	     int id = Integer.parseInt(bf.readLine().trim());
	     
	String s = dao.getAddressOfEmployee(id);
	
	System.out.println(s);
	
	
		
		
	}
		
	public static void giveBonues() throws NumberFormatException, IOException {
		
		 System.out.println("Enter emp id");
	      
	      
	      
	     int id = Integer.parseInt(bf.readLine().trim());
	     
	     
	     System.out.println("Enter Bonus Amoutn");
	      
	      
	      
	     int bonus = Integer.parseInt(bf.readLine().trim());
	     
	String s = dao.giveBonusToEmployee(id,bonus);
	
	
	System.out.println(s);
	
	}
	
	public static void removeEmp() throws NumberFormatException, IOException {
		


	      System.out.println("Enter emp id");
	      
	      
	      
	     int id = Integer.parseInt(bf.readLine().trim());
	     
	if( dao.deleteEmployee(id))
	
	System.out.println("Removed Employee whos id is - " + id);
	else {
		System.out.println("Enter valid id");
		
		
	}
	
	}
	
}
