package rest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.Employee;

@SpringBootApplication
@ComponentScan(basePackages ={"rest"})
public class TestApp {
	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
	}
}

  