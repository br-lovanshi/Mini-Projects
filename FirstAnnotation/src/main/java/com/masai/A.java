package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "a1")
public class A {
	
	@Autowired(required = false)
	@Qualifier("b")
	private B b1;
	
	
	public void fun1() {
		
	
		System.out.println("Hello!");
		System.out.println(b1);
	}
}
