package com.ih.aop.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class AopSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopSpringbootApplication.class, args);
	}

}
