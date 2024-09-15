package com.Rest.RestAPI.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	// DAO stands for Data Access Object
	private static List<User> user = new ArrayList<>();

	static {
		user.add(new User(1, "Hari", LocalDate.now().minusYears(20)));
		user.add(new User(2, "Aman", LocalDate.now().minusYears(30)));
		user.add(new User(3, "Kishore", LocalDate.now().minusYears(40)));
	}

	public List<User> getAllUser() {
		return user;
	}

	public User addUser(User _user) {
		user.add(_user);
		return _user;
	}

	public User findUserById(int id) {
		Predicate<? super User> predicate = user -> user.getId() == id;
		return user.stream().filter(predicate).findFirst().get();
	}
}
