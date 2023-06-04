package com.anand.java11;

import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {

	public static void main(String[] args) {
		
		var fruitList = List.of("Apple","Guava","Banana","Orange","Pineapple","Mango");
		
		//String []fruitArr = fruitList.toArray(s->new String[s]);
		String []fruitArr = fruitList.toArray(String[]::new);
		System.out.println(Arrays.toString(fruitArr));
	}

}
