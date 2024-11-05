package user;

public class User {
	private int id;
	private String name;
	private String userId;
	private String emailId;

	public User(int id, String name, String userId, String emailId) {
		this.id = id;
		this.name = name;
		this.userId = userId;
		this.emailId = emailId;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", userId=" + userId + ", emailId=" + emailId + "]";
	}

}
