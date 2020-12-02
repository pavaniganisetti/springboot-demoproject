package springboot.javabrains.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //spring mvc annotation
public class HelloController {
	
	
	@RequestMapping("/hello") //spring mvc annotation. by default it is get method
	public String sayHello() {
		return "Hello! ";
	}
}
