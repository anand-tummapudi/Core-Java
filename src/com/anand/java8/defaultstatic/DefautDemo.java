package com.anand.java8.defaultstatic;

interface Vehicle{
	String getBrand();
	String speedUp();
	String slowDown();
	
	default String turnAlarmOn() {
		return "Turning vehicle alarm On";
	}
	
	default String turnAlarmOff() {
		return "Turning vehicle alarm Off";
	}
	
	static String greetings() {
		return "Congratulations on purchasing your new Car.";
	}
}

class Car implements Vehicle{

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return "Brand";
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return "Speed Up";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "Slow Down";
	}
	
}


public class DefautDemo {

	public static void main(String[] args) {
		Vehicle car = new Car();
		System.out.println(car.getBrand());
		System.out.println(car.turnAlarmOn());
		System.out.println(Vehicle.greetings());
	}

}
