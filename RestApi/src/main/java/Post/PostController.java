package Post;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Student.Student;
import Student.StudentRepository;

@RestController
@RequestMapping("student/{id}/post")
public class PostController {
	private StudentRepository studRepository;
	private PostRepository postRepository;

	public PostController(StudentRepository studRepository, PostRepository postRepository) {
		this.studRepository = studRepository;
		this.postRepository = postRepository;
	}

	@GetMapping
	public List<Post> getAllPost(@PathVariable int id) {
		Optional<Student> student = studRepository.findById(id);
		return student.get().getPost();
	}

	@PostMapping
	public void createPostStudent(@PathVariable int id, @RequestBody Post post) {
		Optional<Student> student = studRepository.findById(id);
		post.setStudent(student.get());
		postRepository.save(post);
	}
}
