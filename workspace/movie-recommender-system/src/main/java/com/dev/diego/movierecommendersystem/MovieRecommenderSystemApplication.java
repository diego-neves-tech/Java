package com.dev.diego.movierecommendersystem;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		// Old way using the new class
		RecommenderImplementation filter = new RecommenderImplementation(new ContentBasedFilter());
		System.out.println(Arrays.toString(filter.recommendMovies("movies")));

		// New way using the the context
		RecommenderImplementation filter1 = context.getBean(RecommenderImplementation.class);
		
		System.out.println(Arrays.toString(filter1.recommendMovies("movies")));
	}

}
