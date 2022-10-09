package UseCases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
     BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		CallToDao callToDao = new CallToDao();
		while(true) {
		System.out.println("Press 1 for save Employee");
		System.out.println("Press 2 for getAddressOfEmployee");
		System.out.println("Press 3 for give Bonues");
		System.out.println("Press 4 for delete Employee");
		
		 int n = Integer.parseInt(bf.readLine().trim());
		
		
		if(n == 1) {
			
			callToDao.callForSave();
			
			
		}else if( n == 2) {
			
			CallToDao.getAddress();
			
		}
else if( n == 3) {
			
			CallToDao.giveBonues();
			
		}
else if( n == 4) {
	
	CallToDao.removeEmp();

}
		else {
		
		System.out.println("invalid OPTION");
		
		}
	}
	}
}
