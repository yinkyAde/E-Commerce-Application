package com.app.domain.jwt;

import com.app.domain.user.UserDTO;
import lombok.Data;

@Data
public class JWTAuthResponse {
	private String token;
	
	private UserDTO user;
}