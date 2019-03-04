package com.anand.java.practice;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo3Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(2,4,5,9,8,4,10,2,7,6,4);
		numbers.stream().filter(i->i%2==0).limit(3).distinct().sorted().forEach(System.out::println);
	}
}
