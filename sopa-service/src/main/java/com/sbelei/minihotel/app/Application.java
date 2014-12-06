package com.sbelei.minihotel.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.sbelei.minihotel.endpoint", "com.sbelei.minihotel.repository", "com.sbelei.minihotel.wsconfig"})
@EnableAutoConfiguration(exclude={ErrorMvcAutoConfiguration.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
