package com.anand.java8.methodrefer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable{
	void print(String s);
}

public class MethodReferenceEx {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public void display(String s) {
		System.out.println("Hello "+s.toUpperCase());
	}

	public static void main(String[] args) {
		
		// 1. Method reference to a static method.
		Function<Integer, Double> function = (input) -> Math.sqrt(input);
		System.out.println(function.apply(4));
		
		// Using method reference
		Function<Integer, Double> methReffunction = Math::sqrt;
		System.out.println(methReffunction.apply(25));
		
		//Lambda Expression
		//BiFunction<Integer, Integer, Integer> biFunMethRef = (a,b)-> MethodReferenceEx.add(a,b);
		BiFunction<Integer, Integer, Integer> biFunMethRef = MethodReferenceEx::add;
		System.out.println(biFunMethRef.apply(20, 30));
		
		//2. Method reference demo
		MethodReferenceEx methodReference = new MethodReferenceEx();
		methodReference.display("Anand");
		
		// WritingLambda
		Printable printable = s-> methodReference.display(s); 
		printable.print("Anand");
		
		// Method Reference
		Printable printableRef = methodReference::display;
		printableRef.print("Anand");
		
		//3. Reference to the instance method of an arbitrary object
		Function<String, String> arbitraryFunc = s -> s.toUpperCase();
		System.out.println(arbitraryFunc.apply("Hello Anand"));
		
		//Method Reference
		Function<String, String> arbitraryMethFunc = String::toUpperCase;
		System.out.println(arbitraryFunc.apply("Hello Anand"));
		
		String []array = {"Anand", "Sam", "Hello", "Canan","Jog","Balu"};
		Arrays.sort(array,(s1,s2)->s1.compareTo(s2));
		
		Arrays.asList(array).forEach(s -> System.out.println(s));
		
		//Adding Method reference
		Arrays.sort(array,String::compareTo);
		
		//4. Reference to Constructor
		
		List<String> fruitList = new ArrayList<>();
		
		fruitList.add("Guava");
		fruitList.add("Jackfruit");
		fruitList.add("Apple");
		fruitList.add("Banana");
		
		Function<List<String>, Set<String>> setFunc = (fruitsList) -> new HashSet<>(fruitsList);
		System.out.println(setFunc.apply(fruitList));
		
		Collections.sort(fruitList,String::compareTo);
		
		System.out.println(fruitList);
		
		Function<List<String>, Set<String>> setFunc2 = HashSet::new;
		System.out.println(setFunc2.apply(fruitList));
		
		
		
		
		
		
		
	}

}
