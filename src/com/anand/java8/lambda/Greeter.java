package com.anand.java8.lambda;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Greeter greet = new Greeter(); HelloWorldGreeting greeting = new
		 * HelloWorldGreeting(); greet.greet(greeting);
		 */
		
		Greeting myfunction = () -> System.out.println("Hellow World");
		//myfunction.perform();
		
		Greeting greetingFunc = new Greeting() {
			public void perform() {
				System.out.println("Hellow World Anonymous inner class");
			}
		};
		
		//greetingFunc.perform();
		Greeter greet = new Greeter();
		greet.greet(greetingFunc);
		greet.greet(myfunction);
		
		
	}
	
	public void greet(Greeting greeting) {
		//System.out.println("Hello World");
		greeting.perform();
	}

}
