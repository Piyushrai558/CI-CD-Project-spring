package com.example.spring;
import org.springframework.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Deploying rest api through elastic bean stalk";
	}

	@GetMapping("/")
	public String homepage() {return  "This is home page for spring boot aws beanstalk example";}

}
