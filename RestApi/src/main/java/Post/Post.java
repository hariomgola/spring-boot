package Post;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Student.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private int id;
	private String Description;

	// important
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Student student;

	public Post() {
		super();
	}

	public Post(int id, String description) {
		super();
		this.id = id;
		Description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", Description=" + Description + "]";
	}

}
