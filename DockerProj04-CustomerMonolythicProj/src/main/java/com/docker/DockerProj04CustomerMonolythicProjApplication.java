package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DockerProj04CustomerMonolythicProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerProj04CustomerMonolythicProjApplication.class, args);
	}

}
