package user;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/users")
	public List<User> allUsers() {
		return Arrays.asList(new User(1, "Hari", "user_Hari", "email_hari@gmail.com"),
				new User(2, "Pooja", "user_pooja", "email_pooja@gmail.com"),
				new User(3, "Taski", "user_taski", "email_taski@gmail.com"),
				new User(3, "Aman", "user_aman", "email_aman@gmail.com"));
	}
}