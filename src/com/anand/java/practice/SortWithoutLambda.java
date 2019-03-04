package com.anand.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortWithoutLambda {
	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(0);
		al.add(2);
		al.add(1);
		al.add(5);
		al.add(11);
		al.add(6);
		
		System.out.println("AL Created");
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println("AL Sorted Ascending ..");
		System.out.println(al);
		
		Collections.sort(al,new MyComparator());
		System.out.println("AL Sorted descending order");
		System.out.println(al);
		
		System.out.println("Sorting with Lambda...");
		
		Comparator<Integer> c = (o1,o2)->{return o1>o2?-1:o1<o2?1:0;};
		
		Collections.sort(al,c);
		System.out.println("Sorted with Labda...");
		
		System.out.println(al);
		
		System.out.println("Otherway");
		Collections.sort(al);
		System.out.println("Ascending:"+al);
		
		Collections.sort(al,(i1,i2)->i1>i2?-1:i1<i2?1:0);
		
		System.out.println(al);
	}

}
