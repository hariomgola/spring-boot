package versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
class userv1 {
	private String name;
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class userv2 {
	private String firstName;
	private String lastName;

}

@RestController
public class VersioningUserController {
	@GetMapping("v1/person")
	public userv1 getFirstV1Person() {
		return new userv1("Hari om");
	}

	@GetMapping("v2/person")
	public userv2 getFirstV2Person() {
		return new userv2("Hari", "om");
	}

	@GetMapping(path = "/person", params = "version=1")
	public userv1 getFirstV1PathPerson() {
		return new userv1("Hari om");
	}

	@GetMapping(path = "/person", params = "version=2")
	public userv2 getFirstV2PathPerson() {
		return new userv2("Hari", "om");
	}

	@GetMapping(path = "/person", headers = "X-API-VERSION=1")
	public userv1 getFirstV1HeaderPerson() {
		return new userv1("Hari om");
	}

	@GetMapping(path = "/person", headers = "X-API-VERSION=2")
	public userv2 getFirstV2HeaderPerson() {
		return new userv2("Hari", "om");
	}

	@GetMapping(path = "/person", produces = "application/vnd.company.app-v1+json")
	public userv1 getFirstV1HeaderProducers() {
		return new userv1("Hari om");
	}

	@GetMapping(path = "/person", produces = "application/vnd.company.app-v2+json")
	public userv2 getFirstV2HeaderProducers() {
		return new userv2("Hari", "om");
	}
}
