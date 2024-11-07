package LogicController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogicController {
	@GetMapping("/")
	@PutMapping("/")
	@PostMapping("/")
	@DeleteMapping("/")
	public String DefaultMapping() {
		return """
				Hi! This Application is created by Hari
				With the help of all Logic of Spring boot
				""";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/string")
	public String returnSomeString() {
		return """
				Hello This is the Simple mapping for the
				Dynamic string using RestController
				""";
	}

	@GetMapping("/defaultbean")
	public LogicBean defaultBean() {
		return new LogicBean("Hi");
	}

	@GetMapping("/path-variable/{name}")
	public String pathVaribleDataReturn(@PathVariable String name) {
		return String.format("Hello Data - %s", name.toUpperCase());
	}
}
