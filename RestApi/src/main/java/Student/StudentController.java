package Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Post.Post;

@RestController
@RequestMapping("/student")
public class StudentController {

	private StudentRepository repository;

	public StudentController(StudentRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public Map<String, Object> getAllStudent() {
		List<Student> students = repository.findAll();
		Map<String, Object> response = new HashMap<>();
		response.put("totalStudents", students.size());
		response.put("statusCode", 200);
		response.put("data", students);
		return response;
	}

	@GetMapping("/{id}")
	public Map<String, Object> getStudent(@PathVariable int id) {
		Optional<Student> students = repository.findById(id);
		Map<String, Object> response = new HashMap<>();
		response.put("statusCode", 200);
		response.put("data", students);
		return response;
	}

	@PostMapping
	public Map<String, Object> addStudent() {
		Map<String, Object> response = new HashMap<>();
		response.put("statusCode", 200);
		return response;
	}

	@DeleteMapping("/{id}")
	public Map<String, Object> deleteStudent(@PathVariable int id) {
		repository.deleteById(id);
		Map<String, Object> response = new HashMap<>();
		response.put("statusCode", 200);
		return response;
	}

}
