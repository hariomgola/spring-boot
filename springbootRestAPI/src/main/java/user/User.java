package user;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity(name = "user_datails") // only when we made DB connection
public class User {
	@Id
	@GeneratedValue
	private int id;
	@Size(min = 2, message = "Name should have atleast 2 characters")
	private String name;
	@Past(message = "Date should be less than current date")
	private LocalDate Date;

}
