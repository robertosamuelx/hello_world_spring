package com.beto.hello_world_spring.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "serie")
public class Serie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Getter(value = AccessLevel.PUBLIC) @Setter(value = AccessLevel.PUBLIC)
	private String name;
	
	@Getter(value = AccessLevel.PUBLIC) @Setter(value = AccessLevel.PUBLIC)
	@OneToMany(cascade = CascadeType.ALL)
	private List<Season> seasons;
}
