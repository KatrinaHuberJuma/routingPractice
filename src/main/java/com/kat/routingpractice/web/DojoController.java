package com.kat.routingpractice.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{aDojo}")
	public String dojo(@PathVariable("aDojo") String aDojo) {
		if (aDojo.equals("dojo")) {
			return "The dojo is awesome";
		}
		else if (aDojo.equals("burbank-dojo")){
			return "Burbank Dojo is located in Southern California";
		}
		else if (aDojo.equals("san-jose")){
			return "SJ dojo is the headquarters";
		}
		else {
			return "'" + aDojo + "' is not a valid query param, ooops.";
		}
	}
}
