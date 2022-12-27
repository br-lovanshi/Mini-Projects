package com.masai.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Pattern(regexp = "/^([0-9]*)$/",
			message = " First Name can not contain any special or numeric character")
	
	private String firstName;
	@Pattern(regexp = "/^([0-9]*)$/",
			message = "Last Name can not contain any special or numeric character")
	private String lastName;
	
	@Column(unique=true)
	@Email(message = "Enter Valid Email")
	@NotNull(message = "USer Name Can not be null")
	private String username;
	
	@NotNull(message = "Provide Mobile Number ")
	@Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$"
			,message ="Mobile number must have 10 digits!")
	private String mobileNo;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate Dob;
	
	@NotNull(message = "Password is mandatory")
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{6,12}$",
	message = "Password should be alphanumeric and must contain 6-12 characters  and must include "
			+ " at least one upper case English letter, one lower case "
			+ "English letter, one number and one special character.")
	private String password;
	
	private String role;
	
	@JsonIgnore
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Event> events=new ArrayList<>();

	public User(Integer id,
			@Pattern(regexp = "/^([0-9]*)$/", message = " First Name can not contain any special or numeric character") String firstName,
			@Pattern(regexp = "/^([0-9]*)$/", message = "Last Name can not contain any special or numeric character") String lastName,
			@Email(message = "Enter Valid Email") @NotNull(message = "USer Name Can not be null") String username,
			@NotNull(message = "Provide Mobile Number ") @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", message = "Mobile number must have 10 digits!") String mobileNo,
			LocalDate dob,
			@NotNull(message = "Password is mandatory") @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{6,12}$", message = "Password should be alphanumeric and must contain 6-12 characters  and must include  at least one upper case English letter, one lower case English letter, one number and one special character.") String password,
			String role, List<Event> events) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.mobileNo = mobileNo;
		Dob = dob;
		this.password = password;
		this.role = role;
		this.events = events;
	}
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public LocalDate getDob() {
		return Dob;
	}


	public void setDob(LocalDate dob) {
		Dob = dob;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public List<Event> getEvents() {
		return events;
	}


	public void setEvents(List<Event> events) {
		this.events = events;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", mobileNo=" + mobileNo + ", Dob=" + Dob + ", password=" + password + ", role=" + role + ", events="
				+ events + "]";
	}
	
	
	
}
