package AutoWired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("AutoWired")
public class SpringBeanAutoWiredApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(SpringBeanAutoWiredApplication.class)) {
			System.out.println("*** AutoWired Configuration ***");
			System.out.println(context.getBean(Customer.class).name());
			System.out.println(context.getBean(Customer.class).age());
		}

	}

}
