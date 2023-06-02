package com.anand.java.practice.competetive;

import java.util.Scanner;

public class DigitsOfNumber {

	public static void main(String[] args) {
		
		try(Scanner scn = new Scanner(System.in)){
			
			System.out.println("Enter Number:");
			int n = scn.nextInt();
			int count = 0;
			
			while(n>0) {
				n= n/10;
				count++;
			}
			
			System.out.println("No of Digits:"+count);
		}
	}

}
