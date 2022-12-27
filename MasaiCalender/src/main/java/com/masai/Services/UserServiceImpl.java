package com.masai.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.masai.Config.SecurityConfigurationForUser;
import com.masai.Model.User;
import com.masai.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository uRepository;
	
	@Autowired
	private PasswordEncoder pEncoder;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<User> users=uRepository.findByUsername(username);
		
		if(users.size()!=0) {
			return new SecurityConfigurationForUser(users.get(0));
		}else {
			throw new UsernameNotFoundException(username+"user not found");
		}
	}
	
	public UserDetails createuser(User user) {
		user.setPassword(this.pEncoder.encode(user.getPassword()));
		return new SecurityConfigurationForUser(uRepository.save(user));
	}
	
	public User updateUser(User user) {
		return uRepository.saveAndFlush(user);
	}

}
