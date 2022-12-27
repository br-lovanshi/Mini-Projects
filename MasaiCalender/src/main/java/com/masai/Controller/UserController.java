package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.User;
import com.masai.Services.UserServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/masaicalender")
public class UserController {

	@Autowired
	private UserServiceImpl uService;
	

	
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeHandler(){
		return new ResponseEntity<String>("Welcome to Masai calender App !",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/welcome1")
	public ResponseEntity<String> welcomeUserHandler(){
		return new ResponseEntity<String>("Welcome to Masai calender App with security!",HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/register")
	public ResponseEntity<UserDetails> singUp(@Valid @RequestBody User user){
		UserDetails savedUser= uService.createuser(user);
	return new ResponseEntity<UserDetails>(savedUser,HttpStatus.CREATED);	
	}
	
	public ResponseEntity<User> updateUser(@RequestBody User user){
		
		User updated=uService.updateUser(user);
		return new ResponseEntity<User>(updated,HttpStatus.OK);
	}
	
}
