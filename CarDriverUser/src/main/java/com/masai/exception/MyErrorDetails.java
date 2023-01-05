package com.masai.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MyErrorDetails {

	private String message;
	private LocalDateTime datetime;
	private String description;
	
	public MyErrorDetails() {
		// TODO Auto-generated constructor stub
	}

	public MyErrorDetails(String message, LocalDateTime datetime, String description) {
		super();
		this.message = message;
		this.datetime = datetime;
		this.description = description;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
}
