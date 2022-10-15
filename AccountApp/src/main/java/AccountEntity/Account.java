package AccountEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String email,address;
	private double balance;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

	public Account(int id, String email, String address, double balance) {
		super();
		this.id = id;
		this.email = email;
		this.address = address;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", address=" + address + ", balance=" + balance + "]";
	}
	
	
	
}


//account
//id:int Primary key
//email: varchar
//address: varchar
//balance:double
//AccountDao Interface:
//public interface AccountDao {
