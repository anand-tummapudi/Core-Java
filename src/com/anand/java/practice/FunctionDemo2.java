package com.anand.java.practice;

import java.util.function.Function;

public class FunctionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Ananda Raju";
		Function<String,String> f1 = s->s.toUpperCase();
		Function<String,String> f2 = s->s.substring(0, 5);
		System.out.println(f1.apply(s1));
		System.out.println(f2.apply(s1));
		System.out.println(f1.andThen(f2).apply(s1));
		System.out.println(f1.compose(f2).apply(s1));
		
		Integer num = 10;
		
		Function<Integer,Integer> f3 = n->n+n;
		Function<Integer,Integer> f4 = n->n*n;
		
		System.out.println(f3.apply(num));
		System.out.println(f4.apply(num));
		System.out.println(f3.andThen(f4).apply(num));
		System.out.println(f3.compose(f4).apply(num));
		

	}

}
