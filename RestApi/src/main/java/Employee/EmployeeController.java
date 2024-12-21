package Employee;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private EmployeeDaoService service;

	public EmployeeController(EmployeeDaoService service) {
		this.service = service;
	}

	@GetMapping
	public List<Employee> getAllEmployees() {
		return this.service.getAllEmployee();
	}

	@GetMapping("/{id}")
	public List<Employee> getEmployee(@PathVariable int id) {
		return this.service.getEmployeeById(id);
	}

	@PostMapping
	public ResponseEntity<Object> addEmployee(@RequestBody Employee emp) {
		this.service.addEmployee(emp);
		return ResponseEntity.created(null).build();
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) {
		this.service.deleteEmployee(id);
	}

}
