package com.anand.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class SortPersonExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Anand","Raju",20),
				new Person("sam","singh",23),
				new Person("Ram","Dlau",20),
				new Person("John","Dan",25),
				new Person("Saroja","Dua",23));
		
		//Step 1 - Sort list by lastName
		System.out.println("Sort list by lastname - Java 7 approach");
		/*
		 * Collections.sort(people, new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { return
		 * (o1.getLastName().compareTo(o2.getLastName())); } });
		 */
		
		Collections.sort(people,(Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		//Step 2 - Create a  method that prints all elements in the List
		System.out.println("#### Printing All Persons ####");
		//printAllPeople(people);
		
		printFilteredPeople(people, p -> true);
		
		//Step 3 - Create a method that prints all people last name Beginning with D
		
		System.out.println("#### Print persons with lastname starting with D #### ");
		/*
		 * printFilteredPeople(people, new Condition() {
		 * 
		 * @Override public boolean test(Person p) { // TODO Auto-generated method stub
		 * return p.getLastName().startsWith("D"); }
		 * 
		 * });
		 */
		printFilteredPeople(people,p->p.getLastName().startsWith("D"));
		
	}

	private static void printFilteredPeople(List<Person> people, Predicate<Person> pre) {
		for(Person p:people) {
			if(pre.test(p)) {
				System.out.println(p);
			}
		}
		
	}

	/*
	 * private static void printAllPeople(List<Person> people) { for(Person
	 * p:people) { System.out.println(p); }
	 * 
	 * }
	 */
}
