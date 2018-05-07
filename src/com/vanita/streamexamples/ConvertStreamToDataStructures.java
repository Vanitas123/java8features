package com.vanita.streamexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 
 * Example from - http://www.javainuse.com/java/java8_streams
 * 
 * */
public class ConvertStreamToDataStructures {

	public static void main(String[] args) {
		
		System.out.println("-------Get Collections using stream.collect(Collectors.toList()).-------");
		Stream<String> myStream = Stream.of("This","is","java"," version 8","stream","api");
		List<String> myList = myStream.collect(Collectors.toList());
		System.out.println(myList);
		
		System.out.println("------Get arrays using stream.toArray(EntryType[]::new)----------");
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Stream<Integer> intStream = list.stream();
		Integer[] myArray = intStream.toArray(Integer[]::new);
		System.out.println(myArray[0]);
		
		

		

	}

}
