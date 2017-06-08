package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {

	/**
	 * run as JAR
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}
	
	
	/**
	 * run as WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(MicroservicesBootApplication.class);
	}
}
