package com.anand.threads;

public class RunnableThread implements Runnable{
	private int threadNumber;
	
	public RunnableThread(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Printing:"+i+" From Thread:"+threadNumber);
		}
	}

}
