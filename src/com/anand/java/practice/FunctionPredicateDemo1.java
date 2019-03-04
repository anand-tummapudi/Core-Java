package com.anand.java.practice;

import java.util.function.Function;

public class FunctionPredicateDemo1 {

	public static void main(String[] args) {
		
		Function<String,Integer> f = s->s.length();
		
		System.out.println(f.apply("AnandaRaju"));
		
		Function<Integer,Integer> square = i->i*i;
		
		System.out.println("Square of 10:"+square.apply(10));

	}

}
