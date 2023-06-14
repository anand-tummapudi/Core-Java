package com.anand.hackerrank;

public class RepeatedString {

	public static void main(String[] args) {
		String s = "abc";
		int length = 10;
		
		int letterCount = findCountOfChar(s,length);//getLetterCount(s,length);
		
		System.out.println("Letter Count:"+letterCount);
	}

	private static int getLetterCount(String s, int length) {
		
		int charCount = 0;
		if(s.length()<length) {
			StringBuilder sb = new StringBuilder();
			while(sb.length()<=length) {
				sb = sb.append(s);
			}
			String s2 = sb.toString().substring(0,length);
			System.out.println("Modified String:"+s2+" Length"+s2.length());
			charCount = findCount(s2);
		}
		
		return charCount;
	}

	private static int findCount(String s) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.toCharArray()[i]=='a') {
				count++;
			}
		}
		
		return count;
	}
	
	private static int findCountOfChar(String s,int length){
			int tempCnt = 0;
			int actCnt = 0;
			for(int i=0;i<s.length();i++) {
				if(s.toCharArray()[i]=='a') {
					tempCnt++;
				}
			}
			int lenCnt = length/s.length();
			actCnt = tempCnt*lenCnt;
			
			int rem = length%s.length();
			
			if(rem>0) {
				String subStr = s.substring(0,rem);
				for(int i=0;i<subStr.length();i++) {
					if(subStr.toCharArray()[i]=='a') {
						actCnt++;
					}
				}
			}
			
	return actCnt;
	}

}
