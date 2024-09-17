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
	private static int userId = 0;

	static {
		user.add(new User(++userId, "Hari", LocalDate.now().minusYears(20)));
		user.add(new User(++userId, "Aman", LocalDate.now().minusYears(30)));
		user.add(new User(++userId, "Kishore", LocalDate.now().minusYears(40)));
	}

	public List<User> getAllUser() {
		return user;
	}

	public User addUser(User localuser) {
		localuser.setId(++userId);
		user.add(localuser);
		return localuser;
	}

	public User findUserById(int id) {
		Predicate<? super User> predicate = user -> user.getId() == id;
//		return user.stream().filter(predicate).findFirst().get();
		return user.stream().filter(predicate).findFirst().orElse(null);
	}

	public void deleteUser(int id) {
		Predicate<? super User> predicate = user -> user.getId() == id;
		user.removeIf(predicate);
	}
}
