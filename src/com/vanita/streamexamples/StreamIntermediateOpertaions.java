package com.vanita.streamexamples;

import java.util.Arrays;
import java.util.List;

/*
 * Intermediate operations- 
 * Intermediate operations which return another Stream which allows 
 * operations to be connected in a form of a query
 * 
 * - allows chaining on stream operations
 *  examples - filter, map, sorted
 *  
 *  http://www.javainuse.com/java/java8_streams
 *  
 * */
public class StreamIntermediateOpertaions {

	public static void main(String[] args) {
		
		System.out.println("--------filter() operation helps eliminate elements based on certain criteria. ------");
		List<String> data = Arrays.asList("java", "not", "in", "use");
		data.stream().filter(a -> !("not".equals(a)))
					 .forEach(p -> System.out.println(p));
		
		System.out.println("-----------map() operation helps map elements to the corresponding results.-----------");
		data.stream().filter(a -> !a.startsWith("n")).map(String::toUpperCase).forEach(System.out :: println); ///??? syntax  ::?
		
		System.out.println("--------sorted() operation helps sort elements -----------------");
		data.stream().sorted().forEach(p-> System.out.println(p));
		
		
		
		
	}
}
