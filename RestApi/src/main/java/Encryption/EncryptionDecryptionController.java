package Encryption;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/security")
public class EncryptionDecryptionController {
	@GetMapping
	public String DecryptSecurity() {
		return "Hi I am the Security code for the rest API";
	}
}
