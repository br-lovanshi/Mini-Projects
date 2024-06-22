package com.spring.security.test.SpringSecurityTest.controllers;

import com.spring.security.test.SpringSecurityTest.Model.User.User;
import com.spring.security.test.SpringSecurityTest.dto.UserRegisterRequest;
import com.spring.security.test.SpringSecurityTest.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/admin")
public class AdminController {
    @Autowired
    UserService userService;
    @GetMapping()
    public ResponseEntity<User> getProfile(Authentication authentication){

        // Get ID of logged-in user
        String userName = null;
        if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
             userName = ((UserDetails) authentication.getPrincipal()).getUsername();
        }
        System.out.println("\n\n\n UserNmae:- " + userName);
        return new ResponseEntity<>(userService.getAdminProfile(userName), HttpStatus.OK);
    }
    @PostMapping("/register-admin")
    public ResponseEntity<String> registerAdmin(@RequestBody @Valid UserRegisterRequest request) throws Exception{
        String response = userService.registerAdmin(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
