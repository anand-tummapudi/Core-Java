package com.anand.java12;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hellow World";
		System.out.println(s1.indent(5));
		
		String s2 = "Hello World";
		String transformed = s2.transform(s -> s.toLowerCase());
		System.out.println(transformed);
	}	

}
