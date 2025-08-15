package springboot.springbootRestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("defaultController")
@ComponentScan("user")
@ComponentScan("exception")
@ComponentScan("versioning")
@ComponentScan("filtering")
@ComponentScan("LearningLogic")
@ComponentScan("config")
@ComponentScan("interceptors")
public class SpringbootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApiApplication.class, args);
	}

}
