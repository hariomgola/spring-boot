package springDataJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

// Here customer is table name in the entity
@Entity
@Data
@AllArgsConstructor
public class Customer {
	@Id
	private int id;
	private String name;
	private String username;
	private String emailid;
}
