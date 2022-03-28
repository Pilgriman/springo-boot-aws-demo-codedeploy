package com.github.pilgriman.springbootawsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsDemoApplication {
	@GetMapping("api/health")
	public String home(){
		return "It works successfully...!!";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsDemoApplication.class, args);
	}

}
