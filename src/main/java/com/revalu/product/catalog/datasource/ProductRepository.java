package com.revalu.product.catalog.datasource;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.revalu.product.catalog.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	 List<Product> findByCategoriesName(String categoryName);
	 List<Product> findByTagsContaining(String tagName);
}
