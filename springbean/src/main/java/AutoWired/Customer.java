package AutoWired;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	public String name() {
		return "Hari";
	}

	public int age() {
		return 15;
	}
}
