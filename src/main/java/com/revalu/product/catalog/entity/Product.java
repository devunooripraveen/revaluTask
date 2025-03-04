package com.revalu.product.catalog.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "epd_data")
@Data
public class Product {
	@Id
	private String id;
	private String uuid;
	private String name;
	private List<Category> categories;
	private List<String> tags;
}
