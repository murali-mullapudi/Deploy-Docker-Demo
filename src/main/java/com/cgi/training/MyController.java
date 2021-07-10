package com.cgi.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("sayHello")
	public String sayHelloDocker() {
		return "Hello Murali! From Docker Container.";
	}
}
