package springboot.springbootdb.springJPA;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerJPARepository {
	// @Autowired
	@PersistenceContext
	private EntityManager entityManager;

	public void insert(Customer customer) {
		entityManager.merge(customer);
	}

	public Customer readById(int id) {
		return entityManager.find(Customer.class, id);
	}

	public void deleteById(int id) {
		Customer customer = entityManager.find(Customer.class, id);
		entityManager.remove(customer);
	}
}
