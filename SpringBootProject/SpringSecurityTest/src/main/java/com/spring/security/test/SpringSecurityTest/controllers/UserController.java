package com.spring.security.test.SpringSecurityTest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    @GetMapping()
    public ResponseEntity<String> getAllUser(){
        return new ResponseEntity<>("I am user", HttpStatus.OK);
    }

}
