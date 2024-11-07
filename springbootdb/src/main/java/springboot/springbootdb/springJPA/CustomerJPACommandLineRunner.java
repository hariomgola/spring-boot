package springboot.springbootdb.springJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerJPACommandLineRunner implements CommandLineRunner {
	@Autowired
	private CustomerJPARepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Customer(1, "hari", "user_hari", "email_hari"));
		repository.insert(new Customer(2, "pooja", "username_pooja", "email_pooja"));
		repository.insert(new Customer(3, "alok", "username_alok", "email_alok"));
		repository.insert(new Customer(4, "aman", "username_aman", "email_aman"));
		repository.insert(new Customer(5, "taski", "username_taski", "email_taski"));
		repository.insert(new Customer(6, "Kali", "username_kali", "email_kali"));

		repository.deleteById(2);
		System.out.println("\n\n\n>> " + repository.readById(1));

	}
}
