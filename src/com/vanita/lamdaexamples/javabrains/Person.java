package com.vanita.lamdaexamples.javabrains;

import java.util.Collections;

public class Person implements Comparable<Person>{

	private String firstName;
	private String lastName;
	private int age;
	
	Person(String fname,String lname, int age){
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "FirstName:"+this.firstName+" LastName:"+this.lastName+" Age:"+age;
	}

	@Override
	public int compareTo(Person o) {
				return o.firstName.compareToIgnoreCase(this.firstName);
	}
}
