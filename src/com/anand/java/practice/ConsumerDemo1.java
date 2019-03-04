package com.anand.java.practice;

import java.util.function.Consumer;

public class ConsumerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> f1 = s->System.out.println(s);
		f1.accept("Anand");

	}

}
