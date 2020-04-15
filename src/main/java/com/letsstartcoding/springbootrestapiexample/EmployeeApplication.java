package com.letsstartcoding.springbootrestapiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@PropertySources(value = {@PropertySource("classpath:application.properties")})
public class EmployeeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
