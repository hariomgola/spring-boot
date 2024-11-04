package spring.boot.springbeam;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// creating the class using record
record Person(String name, int age, Address address) {
};

record Address(String city, String state) {
};

@Configuration
public class Customer {
	@Bean
	public String name() {
		return "Hari";
	}

	@Bean
	public int age() {
		return 15;
	}

	@Bean
	@Primary
	public Person person() {
		return new Person("Hari", 10, new Address("NCR", "New,Delhi"));
	}

	// creating beam using method call
	@Bean
	public Person person_methodCall() {
		return new Person(name(), age(), address());
	}

	// creating beam using Parameter
	@Bean
	public Person person_parameter(String name, int age, @Qualifier("address_local") Address address) {
		return new Person(name, age, address);
	}

	@Bean(name = "address")
	@Primary
	public Address address() {
		return new Address("Delhi", "New,Delhi");
	}

	@Bean(name = "address_Local")
	@Qualifier("address_local")
	public Address address_Local() {
		return new Address("NCR Q", "New,Delhi");
	}

}
