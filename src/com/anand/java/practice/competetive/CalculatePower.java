package com.anand.java.practice.competetive;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String []args) {
		Scanner scn  = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = scn.nextInt();
		
		System.out.println("Enter Power:");
		int p = scn.nextInt();
		
		int result = pow(n,p);
		
		System.out.println(n+" Power to "+p+" Result:"+result);
	}

	private static int pow(int n, int p) {
			if(n<0) return 1/power(n,-p);
			//int result = power(n,p);
		return power(n,p);
	}

	private static int power(int n, int p) {
		
		if(p==0) return 1;
		int result = power(n,p-1); 

		return n*result;
	}
	
	
}
