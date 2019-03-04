package com.anand.java.practice;

import java.util.function.Predicate;

public class PredicateDemo3 {
	
	public static void main(String args[]) {
		String[] names = {"Anand","Sam","Ram","Govind","Aravind","Ammu","Ravi"};
		
		Predicate<String> startsWithA = string->string.startsWith("A");
		
		for(String s:names) {
			if(startsWithA.test(s)) {
				System.out.println(s);
			}
		}
	
	}

}
