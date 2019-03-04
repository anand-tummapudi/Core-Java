package com.anand.java.practice;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String args[]) {
		
		Integer[] x = {2,11,4,10,12,5,8,25};
		Predicate<Integer> p1 = i->i>10;
		Predicate<Integer> p2 = i->i%2==0;
		
		System.out.println("Numbers greater than 10 are ");
		validate(p1,x);
		
		System.out.println("Even Numbers are");
		validate(p2,x);
		
		System.out.println("Odd Numbers are");
		validate(p2.negate(),x);
		
		System.out.println("Numbers Greaterthan 10 and Even");
		validate(p1.and(p2),x);
		
		System.out.println("Numbers Greater than 10 or Even");
		validate(p1.or(p2),x);
		
		System.out.println("Numbers Greaterthan 10 or odd");
		validate(p1.or(p2.negate()),x);
		
	}
	
	public static void validate(Predicate<Integer> p, Integer[] x) {
		for (Integer integer : x) {
			if(p.test(integer)) {
				System.out.println(integer);
			}
		}
	}
}
