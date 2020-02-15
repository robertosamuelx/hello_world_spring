package com.beto.hello_world_spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("hello")
	public String getJson() {
		return "DONE!";
	}
}
