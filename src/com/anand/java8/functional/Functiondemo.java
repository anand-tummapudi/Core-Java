package com.anand.java8.functional;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

	@Override
	public Integer apply(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}
	
}

public class Functiondemo{

	public static void main(String[] args) {
		
		Function<String, Integer> function = (s)-> s.length();
		
		System.out.println(function.apply("Hello World"));
	}

}
