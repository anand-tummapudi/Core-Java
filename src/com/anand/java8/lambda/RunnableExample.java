package com.anand.java8.lambda;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("New Runnable Example");
			}
			
		});
		
		myThread.run();
		
		Thread myLambdaThread = new Thread (() -> System.out.println("My Lambda thread"));
		
		myLambdaThread.run();
	}

}
