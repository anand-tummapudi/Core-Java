package com.anand.hackerrank;

public class StringPalindrome {

	public static void main(String[] args) {
		String s = "java";
		
		boolean status = isPalindrome(s);
		if(status) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	private static boolean isPalindrome(String s) {
			int i=0;
			int j=s.length()-1;
			while(i<s.length()) {
				if(!(s.charAt(i)==s.charAt(j))) {
					return false;
				}
				i++;
				j--;
			}
		return true;
	}

}
