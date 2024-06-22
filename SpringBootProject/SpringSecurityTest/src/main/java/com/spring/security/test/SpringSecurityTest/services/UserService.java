package com.spring.security.test.SpringSecurityTest.services;

import com.spring.security.test.SpringSecurityTest.Model.User.JwtResponse;
import com.spring.security.test.SpringSecurityTest.Model.User.User;
import com.spring.security.test.SpringSecurityTest.dto.UserRegisterRequest;
import com.spring.security.test.SpringSecurityTest.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void init(){
        if(userRepository.count() == 0 ){
            User admin = new User();
            admin.setRole("MASTER_ADMIN");
            admin.setName("Brajesh");
            admin.setEmail("brlovanshi2001@gmail.com");
            admin.setPassword(passwordEncoder.encode("Good@123"));
            userRepository.save(admin);
            System.out.println("\n\n\n\n\n   Master ADMIN :- " + admin);
        }
    }
    public String registerAdmin(UserRegisterRequest request)throws Exception{
        Optional<User> userOptional = userRepository.findByEmail(request.getEmail());
        if(userOptional.isPresent()){
            throw new Exception("User already exists.");
        }
        if(request.getRole().equals("MASTER_ADMIN")) throw new Exception("Unable to create another master admin");

        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setRole(request.getRole());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        userRepository.save(user);
        return "Admin registered successfully.";
    }

    public User getAdminProfile(String userName){
        Optional<User> user = userRepository.findByEmail(userName);
//        if(user.isEmpty()) throw
        return user.get();
    }
}
