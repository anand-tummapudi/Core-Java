package com.anand.java9;

import java.io.File;
import java.io.FileOutputStream;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("abc.txt");
		
		try(FileOutputStream fos = new FileOutputStream(f)){
			System.out.println("FileOutput Streem");
			String greeting = "Hello World";
			byte []b = greeting.getBytes();
			fos.write(b);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
