package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public OpenAPI springShopOpenAPI() {
		Contact gdaContact = new Contact();
		gdaContact.email("cid.aztk@gmail.com");
		gdaContact.setName("Arquitectura TI");
		return new OpenAPI()
				.info(new Info()
						.title("pruebas")
						.description("esta es una app de pruebas")
						.version("0.0.1")
						.contact(gdaContact)
						.license(
								new License().name("Pruebas").url("")));
	}

}
