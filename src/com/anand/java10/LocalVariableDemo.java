package com.anand.java10;

import java.util.List;

public class LocalVariableDemo {
	
	public static void main(String []args) {
		// Variable type
		var name = "Anand";
		System.out.println(name);
		
		// List type
		var fruitList = List.of("Appple","Banana","Orange","Guava","Watermelon");
		fruitList.forEach(System.out::println);
	}

}
