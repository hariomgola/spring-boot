package user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(1, "Hari", LocalDate.now().minusYears(20)));
		users.add(new User(2, "taski", LocalDate.now().minusYears(21)));
		users.add(new User(3, "alok", LocalDate.now().minusYears(22)));
		users.add(new User(4, "pooja", LocalDate.now().minusYears(23)));
		users.add(new User(5, "aman", LocalDate.now().minusYears(24)));
	}

	public User save(User user) {
		user.setId(users.size() + 1);
		users.add(user);
		return user;
	}

	public List<User> findAll() {
		return users;
	}

	public User findById(int id) {
		Predicate<User> predicate = user -> user.getId() == id;
		// return users.stream().filter(predicate).findFirst().get();
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public void deleteById(int id) {
		Predicate<User> predicate = user -> user.getId() == id;
		users.removeIf(predicate);
	}
}
