package com.bb;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.bb.account.AccountDetails;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@ImportResource("classpath:application-context.xml")
public class AccountTest {
	public static void main(String[] args) {
		ApplicationContext context =  null;
		SpringApplication application=new SpringApplicationBuilder(AccountTest.class).bannerMode(Mode.OFF).build();
		
		context = application.run(args);
		AccountDetails accountDetails = context.getBean("accountDetails", AccountDetails.class);
		System.out.println(accountDetails.getAccountNo("raja"));
	}
}
