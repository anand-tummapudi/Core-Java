package com.anand.java8.optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		// Using empty to create Object
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		// Using Of to create Object
		String s = null;//"Hello World";
		//Optional<Object> ofObj = Optional.of(s);
		//System.out.println(ofObj);
		
		//Using OfNullable
		
		Optional<Object> ofNullableObj = Optional.ofNullable(s);
		System.out.println(ofNullableObj);
		if(ofNullableObj.isPresent())
			System.out.println(ofNullableObj.get());
		
		// OrElse
		String s2 = null;
		
		Optional<String> defaOptionObj = Optional.ofNullable(s2);
		String result = defaOptionObj.orElse("Default Value");
		System.out.println(result);
	}

}
