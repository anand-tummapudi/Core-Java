package com.anand.threads;

public class MyThreadOne extends Thread{
	
	private int threadNumber;
	
	public MyThreadOne(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("Anand stated on Thread:"+threadNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
