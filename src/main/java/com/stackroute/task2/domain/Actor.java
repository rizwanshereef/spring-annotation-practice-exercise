package com.stackroute.task2.domain;

public class Actor {

	private String name;
	private String gender;
	private int age;
	public Actor(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Actor [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
