package Student;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Post.Post;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String message;
	private String address;
	// Important
	@OneToMany(mappedBy = "student") // here the name of property in post student property
	@JsonIgnore
	private List<Post> post;

	public Student() {
	}

	public Student(int id, String name, String message, String address) {
		this.id = id;
		this.name = name;
		this.message = message;
		this.address = address;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", message=" + message + ", address=" + address + "]";
	}

}
