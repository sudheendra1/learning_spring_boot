package com.sudheendra.SpringBootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootdemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootdemoApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringBootdemoApplication.class, args);
		System.out.println("Hello World");

//		Alien obj = new Alien();

		Alien obj = context.getBean(Alien.class);
		System.out.println(obj.getAge());
		obj.code();


	}

}
