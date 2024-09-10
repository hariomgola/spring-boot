package spring.learn;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class learnSpringMain {

	public static void main(String[] args) {
		// launch a spring context
		try (var context = new AnnotationConfigApplicationContext(PersonConfiguration.class)) {
			// config the things that we want to spring to manage - @Configuration

			// Retrieving bean managed by spring
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("_address"));

			System.out.println(context.getBean(Address.class));

			// Calling the usage person beans
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3"));

			System.out.println(context.getBean(Person.class));

			// List of all spring beams
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
