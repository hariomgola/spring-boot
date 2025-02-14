package Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String userName;
	private String emailid;
	private String address;
}
