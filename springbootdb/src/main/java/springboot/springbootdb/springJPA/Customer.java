package springboot.springbootdb.springJPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Here customer is table name in the entity
@Entity(name = "customer")
@Data
@AllArgsConstructor
public class Customer {
	@Id
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "username")
	private String username;
	@Column(name = "emailid")
	private String emailid;
}
