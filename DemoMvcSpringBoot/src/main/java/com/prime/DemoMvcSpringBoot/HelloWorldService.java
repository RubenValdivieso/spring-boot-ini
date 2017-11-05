package com.prime.DemoMvcSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {

	@RequestMapping
	public String hello(){
		return "Hello ooooottt";
	}
	
	/*
	public String hello(@RequestParam(value="name", defaultValue="World") String name){
		return "Hello " + name;
	}
	 */
	 
}
