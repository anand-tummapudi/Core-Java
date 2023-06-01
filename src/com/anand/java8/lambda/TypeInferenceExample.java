package com.anand.java8.lambda;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringLengthLambda strLambda = (String s) -> s.length();
		StringLengthLambda strLambda =  s -> s.length();
		System.out.println(strLambda.getLength("Hello World"));
		
	}
	
	public interface StringLengthLambda{
		public int getLength(String s);
	}
}
