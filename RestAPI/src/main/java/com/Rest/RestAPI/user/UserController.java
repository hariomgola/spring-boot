package com.Rest.RestAPI.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private UserDaoService service;

	public UserController(UserDaoService service) {
		this.service = service;
	}

	@GetMapping(path = "/users")
	public List<User> getAllUsers() {
		return service.getAllUser();
	}

	@GetMapping(path = "/user/{id}")
	public User getUser(@PathVariable int id) {
		return service.findUserById(id);
	}

}
