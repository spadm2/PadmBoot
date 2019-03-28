package com.listner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.listner.app.DockerListner;

@SpringBootApplication
public class ApplicationListner {
	public static void main(String[] args) throws Exception {
		//SpringApplication.run(ApplicationListner.class, args);
		
		SpringApplicationBuilder builder=new SpringApplicationBuilder(ApplicationListner.class);
		builder.listeners(new DockerListner()).build();
		builder.run(args);
	}
}
