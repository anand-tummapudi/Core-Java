package com.anand.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
	static int NO_OF_CHARS = 256;
	static boolean isAnagram(String a, String b) {
	     a = a.toLowerCase();
	     b = b.toLowerCase();
	     char []str1 = a.toCharArray();
	     char []str2 = b.toCharArray();
	     // Create a count array and initialize
	     // all values as 0
	     int[] count = new int[NO_OF_CHARS];
	     int i;
	  
	     // If both strings are of different
	     // length. Removing this condition
	     // will make the program fail for
	     // strings like "aaca" and "aca"
	     if (str1.length != str2.length)
	         return false;
	    
	     // For each character in input strings,
	     // increment count in the corresponding
	     // count array
	     for(i = 0; i < str1.length; i++){
	         count[str1[i]]++;
	         count[str2[i]]--;
	     }
	  
	     // See if there is any non-zero
	     // value in count array
	     for(i = 0; i < NO_OF_CHARS; i++)
	         if (count[i] != 0){
	             return false;
	         }
	     return true;
	    }
	    
	    private static char[] sortCharArray(char []charArr){
	        for(int i=0;i<charArr.length-1;i++){
	            if(charArr[i]<charArr[i+1]){
	                char temp = charArr[i];
	                charArr[i] = charArr[i+1];
	                charArr[i] = temp;
	            }
	        }
	        System.out.println("Sorted Array:"+Arrays.toString(charArr));
	    return charArr;
	    }

  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}
