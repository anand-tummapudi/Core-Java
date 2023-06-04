package com.anand.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FIleDemo {

	public static void main(String[] args) {
		
		var uri = "D:\\Anand\\Works\\Core-Java\\abc.txt";
		try {
			Files.writeString(Path.of(uri), " Writing String", StandardOpenOption.APPEND);
			
			String data = Files.readString(Path.of(uri));
			System.out.println(data);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
