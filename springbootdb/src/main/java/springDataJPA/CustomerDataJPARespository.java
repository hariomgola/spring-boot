package springDataJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDataJPARespository extends JpaRepository<Customer, Integer> {
	// Here we can also define our custom method

	List<Customer> findByUserName(String userName);

	List<Customer> findByName(String name);
}
