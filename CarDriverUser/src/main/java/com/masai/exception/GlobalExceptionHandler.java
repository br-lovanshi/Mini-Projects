package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class GlobalExceptionHandler {

	@ExceptionHandler(DriverException.class)
	public ResponseEntity<MyErrorDetails> DriverException(DriverException de,WebRequest we){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setDatetime(LocalDateTime.now());
		error.setMessage(de.getMessage());
		error.setDescription(we.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(error,HttpStatus.BAD_REQUEST);
				
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exceptionHandler (Exception ex,WebRequest we){
		
		
		MyErrorDetails error = new MyErrorDetails();
		error.setDatetime(LocalDateTime.now());
		error.setMessage(ex.getMessage());
		error.setDescription(we.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(error,HttpStatus.BAD_REQUEST);
		
	}
	
	
}
