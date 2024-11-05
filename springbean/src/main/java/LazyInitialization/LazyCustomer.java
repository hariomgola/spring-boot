package LazyInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// eager Initialization
@Component
class Class_Eager {
	public void Class_Eager() {
		System.out.println("|> Eager Class Initilized");
	}
}

// Lazy Initialization
@Component
class Class_Lazy {
	private Class_Eager class_Eager;

	public void Class_Lazy(Class_Eager class_Eager) {
		this.class_Eager = class_Eager;
		System.out.println("|> Lazy Class Initilized");
	}

	public void PrintFunction() {
		System.out.println("|> Lazy Printing");
	}
}

@Configuration
@ComponentScan
public class LazyCustomer {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(LazyCustomer.class)) {
			System.out.println("*** Context is created ***");
			context.getBean(Class_Lazy.class).PrintFunction();
		}
	}

}
