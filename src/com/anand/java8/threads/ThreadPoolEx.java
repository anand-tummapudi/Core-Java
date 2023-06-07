package com.anand.java8.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolEx {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Future<String> future = executorService.submit(()-> "Hello World");
		try {
			String result = future.get();
			System.out.println("Result:"+result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
