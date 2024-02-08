package com.justcodeit.helloworld_Bean_16_jan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.justcodeit.helloworld_Bean_16_jan.pojo.HelloWorld;

@RestController
public class HelloWorldController {

	// http://localhost:8090/hello-world-bean
	//http://localhost:8090/hello-world-bean/Vishal
	@GetMapping("/hello-world-bean/{name}")
	public HelloWorld helloWorldBean(@PathVariable String name) {
		return new HelloWorld(100, "Hello World....!", "Welcome, "+name+" this is the world of spring boot.");		
	}
}
