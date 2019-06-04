package com.example.Spring_01.model.dto;

public class ProductDTO {
	private String name;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
	this.name = name;
}
	public double getPrice() {
	return price;
}
	public void setPrice(double price) {
	this.price = price;
}

	public ProductDTO() {
		super();
	}

	public ProductDTO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", price=" + price + "]";
	}
	
}
