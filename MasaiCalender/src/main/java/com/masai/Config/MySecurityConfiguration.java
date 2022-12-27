package com.masai.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurityConfiguration {

	@Bean
	public SecurityFilterChain SecurityConfig(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests((auth)->auth
				.requestMatchers("/masaicalender/welcome","/masaicalender/register").permitAll()
				.requestMatchers("/masaicalender/**").authenticated()
				).csrf().disable().httpBasic();
		
		return http.build();
		
	}
	
	@Bean
	public PasswordEncoder pEncoder() {
		return new BCryptPasswordEncoder();
	}
}
