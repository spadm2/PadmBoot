package com.bb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bb.bean.MoterEngine;


@SpringBootApplication
public class BasicTest {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BasicTest.class, args);
		MoterEngine me = context.getBean("moterEngine", MoterEngine.class);
		System.out.println(me);
	}
}
