package com.anand.hackerrank;

public class SubString {

	public static void main(String[] args) {
		
		String a = "abcd";
		String b = "cdabcdab";
		
		int no = repeatedTringMatch(a,b);
		
		System.out.println("No of times Repeated:"+no);

	}

	private static int repeatedTringMatch(String a, String b) {
			if(b.length()<a.length()) {
				if(a.contains(b)) {
					return 1;
				}
			}else {
				StringBuffer sb = new StringBuffer();
				int cnt = 0;
				while(!(sb.indexOf(b)>0)) {
					sb.append(a);
					cnt++;
				}
				
				return cnt;
			}
			
		return -1;
	}

}
