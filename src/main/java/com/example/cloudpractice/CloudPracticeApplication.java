package com.example.cloudpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableAutoConfiguration
@SpringBootApplication
public class CloudPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudPracticeApplication.class, args);
	}

}
