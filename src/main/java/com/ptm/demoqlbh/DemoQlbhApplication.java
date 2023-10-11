package com.ptm.demoqlbh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@EnableSwagger2
@EnableWebMvc


public class DemoQlbhApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoQlbhApplication.class, args);
	}

}
