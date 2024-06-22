package com.spring.security.test.SpringSecurityTest.config;

import com.spring.security.test.SpringSecurityTest.security.JWTAuthenticationFilter;
import com.spring.security.test.SpringSecurityTest.security.JwtAuthenticationEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

     @Autowired
    private JwtAuthenticationEntryPoint point;

     @Autowired
    private JWTAuthenticationFilter filter;

     @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

         http.csrf(csrf -> csrf.disable())
                 .authorizeRequests(
                         auth -> auth
                                 .requestMatchers("api/auth").permitAll()
                                 .requestMatchers("/api/admin/**","api/admin/register-admin").hasRole("MASTER_ADMIN")
                                 .requestMatchers("/api/admin").hasRole("ADMIN")
                                 .requestMatchers("/api/user").hasRole("USER")
                                 .requestMatchers("/v3/api-docs/**", "/swagger-ui/**").permitAll()
                                 .anyRequest().permitAll()

                 )
         .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
                 .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

         http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

         return http.build();
     }

}
