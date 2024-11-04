package spring.boot.springbeam;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbeamApplication {

	public static void main(String[] args) {
		// creating the context
		var context = new AnnotationConfigApplicationContext(Customer.class);
		System.out.println("*** Manually creating and Implementing Bean ***");
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address"));

		System.out.println(context.getBean("person_methodCall"));
		System.out.println(context.getBean("person_parameter"));
		// Accessing by class type
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(Address.class));
	}

}
