package com.masai.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/masaicalendar")
public class SampleController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeHandler(){
		return new ResponseEntity<String>("Welcome to Masai calender App !",HttpStatus.ACCEPTED);
	}
}
