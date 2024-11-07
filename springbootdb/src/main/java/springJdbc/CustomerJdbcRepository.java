package springJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerJdbcRepository {
	@Autowired
	private JdbcTemplate springJdbcTemplate;

	public void insert(Customer customer) {
		springJdbcTemplate.update("""
				insert into customer(id,name,username,emailid)
				values (?,?,?,?);
				""", customer.getId(), customer.getName(), customer.getUsername(), customer.getEmailid());
	}

	public Customer readById(int id) {
		return springJdbcTemplate.queryForObject("""
				select * from customer
				where id = ?;
				""", new BeanPropertyRowMapper<>(Customer.class), id);
	}

	public void deleteById(int id) {
		springJdbcTemplate.update("""
				delete from customer
				where id=?;
				""", id);
	}
}
