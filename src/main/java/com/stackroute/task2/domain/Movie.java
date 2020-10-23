package com.stackroute.task2.domain;

public class Movie {
	
	private Actor actor;

	public Movie(Actor actor) {
		super();
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [actor=" + actor + "]";
	}

	
	

}
