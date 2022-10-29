package Exceptions;

public class EmployeeException extends Exception{
 public EmployeeException() {
	// TODO Auto-generated constructor stub
}
 
   public EmployeeException(String msg) {
	// TODO Auto-generated constructor stub
	   super(msg);
	   System.out.println(msg);
}
 
}
