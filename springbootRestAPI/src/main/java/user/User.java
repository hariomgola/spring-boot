package user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
	private int id;
	@Size(min = 2, message = "Name should have atleast 2 characters")
	private String name;
	@Past(message = "Date should be less than current date")
	private LocalDate Date;

	public User(int id, String name, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		Date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Date=" + Date + "]";
	}

}
