package spring.learn;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record is nothing just a simple java class with all configuration already done introduce in jdk 17
record Person(String name, int age, Address address) {
};

record Address(String firstAdress, String city, int pincode) {
};

@Configuration
public class PersonConfiguration {
	@Bean
	public String name() {
		return "Hari";
	}

	@Bean
	public int age() {
		return 20;
	}

	@Bean
	@Primary
	public Person person() {
		var person = new Person("Hari", 21, new Address("DEL", "N DEL", 10));
		return person;
	}

	@Bean
	public Person person2() {
		var person = new Person(name(), age(), address()); // By Method call
		return person;
	}

	@Bean
	public Person person3(String name, int age, Address _address) {
		var person = new Person(name, age, _address); // By Parameters call
		return person;
	}

	@Bean(name = "_address")
	@Primary
	public Address address() {
		var address = new Address("Delhi", "New Delhi", 121);
		return address;
	}

	@Bean(name = "_address2")
	@Qualifier("Address2Qualifier")
	public Address address2() {
		var address = new Address("Delhi", "New Delhi", 121);
		return address;
	}

	@Bean
	public Person person4Qualifier(String name, int age, @Qualifier("Address2Qualifier") Address _address) {
		var person = new Person(name, age, _address); // By Parameters call
		return person;
	}
}
