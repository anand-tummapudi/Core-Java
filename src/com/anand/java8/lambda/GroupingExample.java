package com.anand.java8.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingExample {
	
	public static void main(String args[]) {
		
		List<Employee> empList = List.of(new Employee("1","name1","M"),
				new Employee("2","name2","F"),
				new Employee("3","name3","M"),
				new Employee("4","name4","F"),
				new Employee("5","name5","M"),
				new Employee("6","name6","F"),
				new Employee("7","name7","M"));
		
		empList.stream().collect(Collectors.groupingBy(emp->emp.getGender(),Collectors.counting()))
		.forEach((gen,count)-> System.out.println(gen+"-"+count));
		
	}

}

class Employee{
	
	private String id;
	private String name;
	private String gender;
	
	
	public Employee(String id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
