package springJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerJPACommandLineRunner implements CommandLineRunner {
	@Autowired
	private CustomerJPARepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Customer(6, "Kali", "username_kali", "email_kali"));
		
		repository.deleteById(5);
		System.out.println("\n\n\n>> " + repository.readById(1));
	}
}
