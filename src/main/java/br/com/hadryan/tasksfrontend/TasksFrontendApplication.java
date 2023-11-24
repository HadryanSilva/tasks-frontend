package br.com.hadryan.tasksfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:application.properties")
public class TasksFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksFrontendApplication.class, args);
	}

}
