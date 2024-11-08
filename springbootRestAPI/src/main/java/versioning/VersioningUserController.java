package versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class userv1 {
	private String name;

	public userv1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "userv1 [name=" + name + "]";
	}

}

class userv2 {
	private String firstName;
	private String lastName;

	public userv2(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "userv2 [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

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
