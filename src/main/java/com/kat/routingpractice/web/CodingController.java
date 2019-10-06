package com.kat.routingpractice.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding/")
public class CodingController {
	
	@RequestMapping("")
	public String coding() {
		return "Hello coding dojo";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Python/django was awesome";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java/spring is awesome";
	}
}
