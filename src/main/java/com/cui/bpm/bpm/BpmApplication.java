package com.cui.bpm.bpm;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BpmApplication {

	public static void main(String[] args) {
		SpringApplication.run(BpmApplication.class, args);
	}

}
