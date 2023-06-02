package com.anand.java.practice.competetive;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		
		System.out.println("Please Enter NUmber:");
		try (Scanner scn = new Scanner(System.in)) {
			int n = scn.nextInt();
			
			if(n<0) {
				System.out.println("Negative Number...");
				return;
			}
			int a = 0;
			int b = 1;
			if(n==0) {
				System.out.println(a);
			}
			else if (n==1) {
				System.out.println(b);
			}else {
				int c = 0;
				for(int i=2;i<n;i++) {
					c = a+b;
					a = b;
					b = c;
					
					System.out.println(c);
				}
			}
		}
	}
	
}
