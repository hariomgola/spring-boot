package springDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerSpringDataJPACommandLineRunner implements CommandLineRunner {

	@Autowired
	private CustomerDataJPARespository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Customer(6, "Kali", "username_kali", "email_kali"));
		repository.deleteById(5);
		System.out.println("\n\n\n>> " + repository.findById(1));
		
	}

}
