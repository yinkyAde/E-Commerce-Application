package com.app.domain.jwt;

import lombok.Data;

@Data
public class JWTAuthRequest {
	private String username;  // email
	private String password;
}