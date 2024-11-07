package springboot.springbootdb.springJPA;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// Here customer is table name in the entity
@Entity(name = "customer")
public class Customer {
	@Id
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "username")
	private String username;
	@Column(name = "emailid")
	private String emailid;

	public Customer() {
	}

	public Customer(int id, String name, String username, String emailid) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", username=" + username + ", emailid=" + emailid + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
}
