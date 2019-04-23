package com.zeshan.restwssecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class RestwsSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestwsSecurityApplication.class, args);
	}
}
