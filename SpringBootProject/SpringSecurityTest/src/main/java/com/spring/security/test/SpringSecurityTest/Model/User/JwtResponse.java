package com.spring.security.test.SpringSecurityTest.Model.User;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse {

    private String jwtToken;
    private String jwtUserName;
}
