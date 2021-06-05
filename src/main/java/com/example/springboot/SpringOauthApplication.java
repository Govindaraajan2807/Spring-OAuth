package com.example.springboot;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOauthApplication {

	@GetMapping()
	public String welcome() {
		return "Welcome to Google!!";
	}
	
	@GetMapping("/user")
	public Principal User(Principal principal) {
		System.out.println("username: "+ principal.getName());
		return principal;
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringOauthApplication.class, args);
	}

}
