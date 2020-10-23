package com.stackroute.task2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroute.task2.domain.Movie;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Movie movieA = context.getBean("movieA",Movie.class);
		Movie movieB = context.getBean("movieB",Movie.class);
		System.out.println(movieA==movieB);
		
	}

}
