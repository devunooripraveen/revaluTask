package com.revalu.product.catalog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.revalu.product.catalog.service.ProductService;

@SpringBootApplication
public class ProductCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogApplication.class, args);
	}
	@Bean
	public CommandLineRunner init(ProductService productService) {
		return args -> productService.createProducts();
	}
}
