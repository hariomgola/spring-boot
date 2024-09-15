package com.Rest.RestAPI.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	// @RequestMapping(method=RequestMethod.GET,path="/hello-world")
	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}

	// Here this Handler Returns the JSON
	@GetMapping(path = "/helloWorldBeans")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	@GetMapping(path = "/helloWorld/pathVariable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean("Hello World " + name);
	}
}