package com.revalu.product.catalog.entity;

import lombok.Data;

@Data
public class Category {
	private int id;
	private String name;
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
