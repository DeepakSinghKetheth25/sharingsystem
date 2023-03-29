package com.sharingsystem.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication( scanBasePackages = {"com.sharingsystem.poc", "com.sharingsystem.poc.product", "com.sharingsystem.poc.user" , "com.sharingsystem.poc.common"} )
@ComponentScan( basePackages = {"com.sharingsystem.poc", "com.sharingsystem.poc.product", "com.sharingsystem.poc.user" , "com.sharingsystem.poc.common"} )
public class SharingsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharingsystemApplication.class, args);
	}

}