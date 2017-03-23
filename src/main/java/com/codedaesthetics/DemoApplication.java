package com.codedaesthetics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
@Configuration
@EnableHypermediaSupport(type = {EnableHypermediaSupport.HypermediaType.HAL})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
