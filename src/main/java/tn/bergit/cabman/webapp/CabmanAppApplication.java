package tn.bergit.cabman.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan( basePackages = {"tn.bergit.cabman.bo"} )
@ComponentScan("tn.bergit.cabman")
@EnableJpaRepositories("tn.bergit.cabman.repository")
public class CabmanAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabmanAppApplication.class, args);
	}
}
