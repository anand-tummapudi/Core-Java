package com.anand.java.practice;

public class AnonymousICDemo {
	
	public static void main(String args[]) {
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Anonymous Thread");
				}
				
			}
			
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread");
		}
	}

}
