package Default;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	@GetMapping("/")
	public Map<String, Object> defaultHandler() {
		HashMap<String, Object> _hs = new HashMap<String, Object>();
		_hs.put("Application Landing page", "localhost:8080/");
		_hs.put("Created By", "Hariom gola \u2764");
		_hs.put("config", Map.of("H2", "http://localhost:8080/h2-console", "Postman",
				"Using talent Api tester from chrome store"));
		_hs.put("End Points",
				Map.of("Employee", "http://localhost:8080/employee", "Student", "http://localhost:8080/student"));
		return _hs;
	}
}
