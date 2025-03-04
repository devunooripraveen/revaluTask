package com.revalu.product.catalog.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revalu.product.catalog.datasource.ProductRepository;
import com.revalu.product.catalog.entity.Category;
import com.revalu.product.catalog.entity.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public List<Product> getProductsByCategory(String categoryName) {
		return productRepository.findByCategoriesName(categoryName);
	}

	public List<Product> getProductsByTag(String tagName) {
		return productRepository.findByTagsContaining(tagName);
	}

	public void createProducts() {
		Product product1 = new Product();
	    product1.setUuid("0d835b0d-4d4e-46cc-88e1-5169f638f6dc");
	    product1.setName("Paint");
	    product1.setCategories(Arrays.asList(new Category(1, "Coverings"), new Category(3, "End product")));
	    product1.setTags(Arrays.asList("new-product"));

	    Product product2 = new Product();
	    product2.setUuid("57f318aa-75ee-4b4b-a7c0-e17400b91897");
	    product2.setName("Mortar");
	    product2.setCategories(Arrays.asList(new Category(2, "Building products"), new Category(3, "End product")));
	    product2.setTags(Arrays.asList());

	    Product product3 = new Product();
	    product3.setUuid("75ee-4baa-0d835bb-a7c0-e174005169f7");
	    product3.setName("Expanded cork");
	    product3.setCategories(Arrays.asList(new Category(4, "Insulation"), new Category(2, "Building products")));
	    product3.setTags(Arrays.asList("bio-based"));

	    productRepository.saveAll(Arrays.asList(product1, product2, product3));
		
	}
}
