package com.vanita.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {

	public static void main(String[] args) {

		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		
		//traverse using iteratior
		
		Iterator it = myList.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator value :"+it.next());
		}
		
		//traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("Anon t:"+t);
			}
			
		});
		
		//traversing with Consumer interface implementation
		MyConsumer action  = new MyConsumer();
		myList.forEach(action);

	}

}
