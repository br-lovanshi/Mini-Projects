package com.spring.security.test.SpringSecurityTest.controllers;

import com.spring.security.test.SpringSecurityTest.Model.User.User;
import com.spring.security.test.SpringSecurityTest.services.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/home")
public class HomeController {
    @GetMapping()
    public ResponseEntity<String> publicAccess(){
        return new ResponseEntity<>("Public access", HttpStatus.OK);
    }

}
