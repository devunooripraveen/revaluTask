package com.revalu.product.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revalu.product.catalog.entity.Product;
import com.revalu.product.catalog.service.ProductService;

@RestController
@RequestMapping("api")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("show_all")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	@GetMapping("categories/{categoryName}")
	public List<Product> getProductsByCategory(@PathVariable String categoryName){
		return productService.getProductsByCategory(categoryName);
	}
	@GetMapping("tags/{tagName}")
	public List<Product> getProductsByTagname(@PathVariable String tagName){
		return productService.getProductsByTag(tagName);
	}
	
}
