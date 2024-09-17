package com.Rest.RestAPI.user;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		User _user = service.findUserById(id);
		if (_user == null) {
			throw new UserNotFoundException("id: " + id);
		}
		return _user;
	}

	@PostMapping(path = "/user")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User savedUser = service.addUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping(path = "/user/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteUser(id);
	}

}
