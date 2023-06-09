package seb43_pre_030.DevHelp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DevHelpApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevHelpApplication.class, args);
	}

}
