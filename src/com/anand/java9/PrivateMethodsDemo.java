package com.anand.java9;

public class PrivateMethodsDemo {

	public static void main(String[] args) {
		PrivateInterface pin = new Private();
		
	}

}

class Private implements PrivateInterface{
	
}


interface PrivateInterface{
	private void disp() {
		System.out.println("Display");
	}
}
