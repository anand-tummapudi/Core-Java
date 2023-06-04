package com.anand.java8.defaultstatic;

interface Inter1{
	default void demo() {
		System.out.println("Default method in Interface1");
	}
}

interface Inter2{
	default void demo() {
		System.out.println("Default mehod in Interface2");
	}
}

class DefultChk implements Inter1,Inter2{

	@Override
	public void demo() {
		Inter1.super.demo();
	}
	
}
public class DefaultDemo2 {
	public static void main(String[] args) {
		Inter2 inter = new DefultChk();
		DefultChk dfc = new DefultChk();
		dfc.demo();
		inter.demo();
	}

}
