package com.anand.java.practice.competetive;

import java.util.Scanner;

public class DigitOccurences {

	public static void main(String[] args) {
		
		System.out.println("Enter Number:");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		System.out.println("Enter the Digit:");
		
		int d = scn.nextInt();
		int cnt = 0;
		while(n>0) {
			int rem = n%10;
			if(rem==d) {
				cnt++;
			}
			n = n/10;
		}
		
		System.out.println("No of Occurences of the Digit:"+d+" is:"+cnt);
	}

}
