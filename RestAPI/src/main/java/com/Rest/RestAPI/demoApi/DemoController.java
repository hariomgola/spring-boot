package com.Rest.RestAPI.demoApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	// @RequestMapping(method=RequestMethod.GET,path="/hello-world")
	@GetMapping(path = "/demo")
	public String helloWorld() {
		return "Hello World";
	}

	// Here this Handler Returns the JSON
	@GetMapping(path = "/demoBean")
	public DemoBean helloWorldBean() {
		return new DemoBean("Hello World");
	}

	@GetMapping(path = "/demo/pathVariable/{name}")
	public DemoBean helloWorldPathVariable(@PathVariable String name) {
		return new DemoBean("Hello World " + name);
	}
}