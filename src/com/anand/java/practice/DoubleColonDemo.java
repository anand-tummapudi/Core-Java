package com.anand.java.practice;

interface DouleColonInterface{
	public void method1();
}

public class DoubleColonDemo {

	public static void method2() {
		System.out.println("Method 2 :::::");
	}
	public static void main(String[] args) {
		DouleColonInterface dc = DoubleColonDemo::method2;
		dc.method1();
	}

}
