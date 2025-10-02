package com.ecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcsApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(EcsApp1Application.class, args);
    	System.out.println("hello world");
	}

}
