package com.listner.app;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class DockerListner implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("welcome to Listner..!");
	}

}
