package com.anand.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.anand.java8.lambda.Person;

public class SortingList {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Anand", "Tummapudi", 23));
		personList.add(new Person("Sam", "Singaroy", 12));
		personList.add(new Person("Prem", "bala", 24));
		personList.add(new Person("Bala", "Jawal", 36));
		personList.add(new Person("Lovely", "Rani", 17));
		
		List<Person> sortedProds = personList.stream().sorted(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		}).collect(Collectors.toList());
		sortedProds.forEach(System.out::println);
		
		// Sorted Ascending Order
		List<Person> personList2 = personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		personList2.forEach(System.out::println);
		
		System.out.println("##### Descending Order #####");
		// Descending Order
		List<Person> personList3 = personList.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
		personList3.forEach(System.out::println);
		
	}

}
