package com.anand.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
	
	public static void main(String []args) {
		List<Product> productList = Arrays.asList(
				new Product(1,"Product1",23.45),
				new Product(2,"Product2",33.5),
				new Product(3,"Product3",63.5),
				new Product(4,"Product4",63.5),
				new Product(5,"Product5",23.5),
				new Product(6,"Product6",13.5),
				new Product(7,"Product7",73.5));
		System.out.println(productList);
		
		//Collections.sort(productList, (Product p1,Product p2) -> p1.getProductName().compareTo(p2.getProductName()));
		List<Product> filterList = productList.stream().filter((product)-> product.getPrice()<50).collect(Collectors.toList());
		System.out.println(filterList);
		
		filterList.forEach(System.out::println);
		
	}

}

class Product{
	
	private int id;
	private String productName;
	private double price;
	
	
	public Product(int id, String productName, double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + "]";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
