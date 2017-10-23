package com.faltdor.gof.structural.composite.model.impl;

import com.faltdor.gof.structural.composite.model.CatalogComponent;

public class Product extends CatalogComponent {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void print() {
		System.out.println("Product name: " + name + " Price: " + price);
	}
}
