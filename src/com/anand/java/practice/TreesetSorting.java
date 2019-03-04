package com.anand.java.practice;

import java.util.TreeSet;

public class TreesetSorting {
	
	public static void main(String args[]) {
		TreeSet<Integer> ts = new TreeSet<>((i1,i2)->i1>i2?-1:i1<i2?1:0);
		ts.add(8);
		ts.add(10);
		ts.add(2);
		ts.add(3);
		ts.add(11);
		ts.add(1);
		System.out.println(ts);
		
		
		
	}

}
