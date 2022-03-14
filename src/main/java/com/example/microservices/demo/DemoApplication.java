package com.example.microservices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
                System.out.println("CI/CD testing 12345");
		SpringApplication.run(DemoApplication.class, args);
	}

}
