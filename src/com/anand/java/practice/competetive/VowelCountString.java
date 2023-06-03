package com.anand.java.practice.competetive;

public class VowelCountString {

	public static void main(String[] args) {
		String s = "abcdkijfyeowu";
		
		int vowelCount = 0;
		int consonentCount = 1;
		for(int i=0;i<s.length();i++) {
			if(isVowel(s.charAt(i))) {
				vowelCount++;
			}else {
				consonentCount++;
			}
		}
	
	System.out.println("Vowel Count:"+vowelCount);
	System.out.println("Consonent Count:"+consonentCount);
		
	}
	
	private static boolean isVowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u') {
			return true;
		}
		return false;
	}

}
