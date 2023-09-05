package com.kash.deploywarfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DeployWarFileApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DeployWarFileApplication.class, args);
	}

}
