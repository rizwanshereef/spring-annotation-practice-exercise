package com.stackroute.task2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.stackroute.task2.domain.Actor;
import com.stackroute.task2.domain.Movie;

import org.springframework.context.annotation.Bean;


@Configuration
public class BeansConfig {
	
	@Bean
	public Actor actorKim() {
		Actor actor = new Actor("Kim", "Male",23);
		return actor;
	}
	
	@Bean
	public Actor actorJim() {
		Actor actor = new Actor("Jim", "Male",25);
		return actor;
	}
	@Bean
	public Actor actorRim() {
		Actor actor = new Actor("Rim", "Female",21);
		return actor;
	}
	
	@Bean({"movieA","movieB"})
	@Scope("prototype")
	public Movie movie() {
		Movie movie= new Movie(actorKim());
		return movie;
		
	}
	
}
