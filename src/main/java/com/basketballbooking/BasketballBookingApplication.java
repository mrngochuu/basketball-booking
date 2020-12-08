package com.basketballbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class BasketballBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasketballBookingApplication.class, args);
	}
	
}
