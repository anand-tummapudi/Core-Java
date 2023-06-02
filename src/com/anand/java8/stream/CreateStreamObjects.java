package com.anand.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreateStreamObjects {
	public static void main(String[] args) {
		
		// Create a Stream.
		Stream<String> stream1 = Stream.of("Anand","Ram","Sam","Suresh");
		stream1.forEach(System.out::println);
		
		System.out.println("#################################");
		//Create a stream from sources
		Collection<String> collection = Arrays.asList("Anand","Sita","Ram","kavya");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);
		
		// Array Stream
		String[] array = {"John","Paul","Tom","Kim"};
		Stream<String> stream3 = Arrays.stream(array);
		stream3.forEach(System.out::println);
		
		
		
		
		
	}

}
