package com.rest.springbootrest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringbootrestApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello Java!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestApplication.class, args);
	}

}
