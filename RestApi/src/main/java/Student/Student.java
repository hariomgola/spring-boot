package Student;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Post.Post;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
}
