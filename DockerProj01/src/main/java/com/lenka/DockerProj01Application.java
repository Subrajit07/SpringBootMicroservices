package com.lenka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerProj01Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerProj01Application.class, args);
		System.out.println("Welcome to Docker SpringBoot Application");
	}

}
