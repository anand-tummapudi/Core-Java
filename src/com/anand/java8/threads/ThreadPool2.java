package com.anand.java8.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPool2 {
	public static void main(String[] args) {
		AtomicInteger counter = new AtomicInteger();
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(()->{
			counter.set(1);
		});
		executor.submit(()->{
			counter.compareAndSet(1,2);
		});
	}
}
