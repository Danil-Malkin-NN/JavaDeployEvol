package ru.nino.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping()
	public String sayHello() {
		return "Hello World";
	}

}