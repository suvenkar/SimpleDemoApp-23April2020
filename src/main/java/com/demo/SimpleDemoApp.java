package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//Test
@SpringBootApplication
//public class SimpleDemoAppApplication extends SpringBootServletInitializer {
public class SimpleDemoApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SimpleDemoApp.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SimpleDemoApp.class);
	}
}
