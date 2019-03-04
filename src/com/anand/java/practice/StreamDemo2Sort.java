package com.anand.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo2Sort {
	
	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(8);
		al.add(3);
		al.add(14);
		al.add(5);
		al.add(9);
		al.add(10);
		al.add(7);
		al.add(4);
		System.out.println(al);
		
		List<Integer> al2 = al.stream().sorted().collect(Collectors.toList());
		System.out.println(al2);
		System.out.println("Descending order");
		
		List<Integer> al3 = al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(al3);
		
		System.out.println("Find Min or Max values in collection");
		
		Integer min = al3.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		Integer max = al3.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		
		System.out.println("For Each ....");
		al3.stream().forEach(System.out::println);
		
		System.out.println("To Array");
		
		Integer[] listArray = al3.stream().toArray(Integer[]::new);
		System.out.println(listArray);
	}

}
