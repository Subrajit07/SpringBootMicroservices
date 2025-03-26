package com.lenka.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class WebController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello Welcome to Restfull webservices with Docker !";
	}

	@GetMapping("/wish")
	public String wishMessage() {
		LocalDateTime ld = LocalDateTime.now();
		int hour = ld.getHour();
		System.out.println(hour);
		if (hour < 12 && hour >= 4)
			return "Good morning Dear !";
		else if (hour >= 12 && hour < 17)
			return "Good evening Dear !";
		else
			return "Good Night Sweet dreams !";
	}
}
