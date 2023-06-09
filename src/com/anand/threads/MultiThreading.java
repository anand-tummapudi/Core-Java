package com.anand.threads;

public class MultiThreading {

	public static void main(String[] args) {
		// Thread example by using Thread Class
		/*
		 * for(int i=0;i<5;i++) { MyThreadOne myThread = new MyThreadOne(i);
		 * myThread.start(); }
		 */
		
		// Thread example by Using Runnable Interface
		for(int i=0;i<5;i++) {
			RunnableThread runThr = new RunnableThread(i);
			Thread thread = new Thread(runThr);
			thread.start();
			/*
			 * try { thread.join(); } catch (InterruptedException e) { e.printStackTrace();
			 * }
			 */	}
		
	}

}
