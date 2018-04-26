package com.example.firstappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstAppDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstAppDemoApplication.class, args);
		System.out.println("Hello World");
	}
	@RequestMapping(value = "test")
	public String Json(){
		return "Hello World2";
	}
}
