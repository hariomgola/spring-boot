package com.springboot.fullstack.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String USER_NAME, String USER_PASSWORD) {
		return USER_NAME.equals("developer") && USER_PASSWORD.equals("webdev") ? true : false;
	}
}
