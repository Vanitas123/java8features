package com.vanita.streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 
 * Terminal operations- 
 * Terminal operations produces a non-stream, result such as primitive value, a collection or no value at all.
 * 
 * examples - foreach, collect, match, count, reduce
 * */
public class StreamTerminalOperations {

	public static void main(String[] args) {
		
		System.out.println("-----------Foreach example--------------");
		List<String> data = Arrays.asList("java", "not", "in", "use");
		data.stream().forEach(p -> System.out.println(p));
		
		System.out.println("---------collect() operation helps to collect the stream result in a collection like list.------");
		Stream<String> stringStream = Stream.of("java","8","is","in","use");
		
		List<String> myList = stringStream.collect(Collectors.toList());
		System.out.println(myList);
		
		System.out.println("---------match() operation returns a boolean depending upon the condition applied on stream data.----------");
		boolean result = data.stream().anyMatch((s) -> s.startsWith("j"));
		System.out.println("result - "+result);
		
		System.out.println("--------count() operation return the aggregate count for stream data.------------");
		long count = data.stream().count();
		System.out.println("Count = "+count);
		
		
		int resultReduce = IntStream.of(1, 2, 3, 4).reduce(0, (a, b) -> a + b); /// ???? Need to understand reduce
		System.out.println(resultReduce);
		
	}
}
