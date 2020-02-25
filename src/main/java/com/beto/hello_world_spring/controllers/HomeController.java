package com.beto.hello_world_spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beto.hello_world_spring.entities.Serie;
import com.beto.hello_world_spring.repositories.Serie_;

@RestController
public class HomeController {
	
	@Autowired
	private Serie_ series;
	
	@RequestMapping(path="index")
	public List<Serie> index() {
		return series.findAll();
	}
	
	@RequestMapping(path="createNewSerie",method = RequestMethod.POST)
	public Serie createNewSerie(@RequestBody Serie serie) {
		return series.saveAndFlush(serie);
	}
}
