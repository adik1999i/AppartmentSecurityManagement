package com.cap.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//github demo
//github 2 branch
@SpringBootApplication
@EnableSwagger2
public class EmployeeCrudSpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudSpringBoot1Application.class, args);
	}
	@Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
	         .apis(RequestHandlerSelectors.basePackage("com.cap.demo.controller")).build();
	   }
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("EMPLOYEE CRUD OPERATIONS")
				.description("API reference for developers")
				.version("V1.0").build();
	}

}
