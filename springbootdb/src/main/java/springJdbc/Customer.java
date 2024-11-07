package springJdbc;

public class Customer {
	private int id;
	private String name;
	private String username;
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
