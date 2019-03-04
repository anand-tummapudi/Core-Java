package com.anand.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(2);
		al1.add(5);
		al1.add(6);
		al1.add(9);
		al1.add(10);
		al1.add(4);
		al1.add(12);
		al1.add(14);
		
		System.out.println(al1);
		
		List<Integer> al2 = al1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(al2);
		
		List<Integer> al3 = al2.stream().map(i->i*2).collect(Collectors.toList());
		
		System.out.println(al3);

	}

}
