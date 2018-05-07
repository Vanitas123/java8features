package com.vanita.lamdaexamples.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Excercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Aan", "Sutar", 30),
				new Person("Garry", "Sutar", 28),
				new Person("Earry", "Sutar", 24),
				new Person("Fan", "Shelar", 31),
				new Person("Nan", "Sutar", 27),
				new Person("Bij", "Sutar", 50),
				new Person("CN", "Sutar", 60));
		
		
		//Sort list by first Name
		Collections.sort(people);
		
		//Print all list elements
		for(int i=0;i<people.size();i++) {
			System.out.println(people.get(i).toString());
		}
		
		//Print all people having last name Sutar
		
		

	}

}
