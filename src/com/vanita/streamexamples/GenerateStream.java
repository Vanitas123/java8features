/**
 * 
 */
package com.vanita.streamexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author vanita.sutar
 *
 */
public class GenerateStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("----- Arrays.stream(T t)-----------------");
		String test[] = {"a","b","c","x","y","z","p"};
		Stream<String> arrayStream = Arrays.stream(test);
		arrayStream.forEach(a -> System.out.println(a));
		
		System.out.println("----- Using Stream.of(T t)>-----------------");
		Stream<String> streamArray = Stream.of(test);
		streamArray.forEach(a -> System.out.println(a));
		
		System.out.println("------ArrayList Stream ----------------------");
		List<String> items = new ArrayList<>();
		items.add("test1");
		items.add("test2");
		items.add("test3");
		items.add("test4");
		items.add("test5");
		
		Stream<String> listStream = items.stream();
		listStream.forEach(i -> System.out.print(i +", "));
		
		
		System.out.println("----------Generate Streams using Stream.generate() ------------");
		
		Stream<String> genStream = Stream.generate(() -> "Hello").limit(10);
		genStream.forEach(a -> System.out.println(a));
		
		
		System.out.println("----------Generate Streams using Stream.iterate()----------");
		Stream<Long> iternateNumber = Stream.iterate(1L, i->i+1).limit(10);
		iternateNumber.forEach(i->System.out.println(i));

		System.out.println("-------------Generate Streams from APIs like Regex.-----------");
		String str =  "this, is, java, I am , Vanita";
		Pattern.compile(",").splitAsStream(str).forEach(s->System.out.print(s+" "));
		
		
		
	}

}
