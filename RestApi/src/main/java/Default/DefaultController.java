package Default;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	@GetMapping("/")
	public DefaultPageResponse defaultHandler() {
		String defaultConfigString = "Hi This is Landing page of the application";
		String defaulth2ConfigString = "H2 URL : http://localhost:8080/h2-console";
		return new DefaultPageResponse(defaultConfigString, defaulth2ConfigString);
	}
}
