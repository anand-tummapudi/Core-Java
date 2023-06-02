package com.anand.java.practice.competetive;

public class ToggleChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aPpLe2PhoNe";
		StringBuffer sb = new StringBuffer();
		char []charArray = s.toCharArray();
		
		for(char c:charArray) {
			if(c>='a' && c<='z') {
				sb.append((char)(c-32));
			}else if(c>='A' && c<='Z') {
				sb.append((char)(c+32));
			}else {
				sb.append(c);
			}
		}
		
		System.out.println("Result String:"+sb.toString());

	}

}
