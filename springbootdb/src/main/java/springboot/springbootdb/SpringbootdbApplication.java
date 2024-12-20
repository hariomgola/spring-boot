package springboot.springbootdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("springJdbc")
//@ComponentScan("springJPA")
//@ComponentScan("springDataJPA")
// Remember to put the JPA inside the original package to get it working
public class SpringbootdbApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootdbApplication.class, args);
	}

}
