package com.beto.hello_world_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beto.hello_world_spring.entities.Episode;

public interface Episode_ extends JpaRepository<Episode, Integer>{

}
