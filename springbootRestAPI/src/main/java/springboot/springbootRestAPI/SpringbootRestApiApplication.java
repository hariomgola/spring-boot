package springboot.springbootRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("LogicController")
@ComponentScan("user")
@ComponentScan("exception")
@ComponentScan("versioning")
@ComponentScan("filtering")
@ComponentScan("LearningLogic")
public class SpringbootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApiApplication.class, args);
	}

}
