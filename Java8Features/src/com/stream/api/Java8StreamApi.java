package com.stream.api;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import javax.sql.RowSet;

public class Java8StreamApi {

	public static void main(String args[]) {
		
		List<Integer> l = Arrays.asList(1,2,3,4,5,6);
		
//		for(int i=0; i<=5; i++) {
//			System.out.println(l.get(i));
//		}

//		Iterator<Integer> i = l.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		for(Integer i : l) {
//			System.out.println(i);
//		}
		
		// Internal Iteration 
		// Functional Interface // Single Abstract Method Interface
		// lambda expression // only for functional interface
//		l.forEach(i -> System.out.println(i));
		
//		Consumer<Integer> c = new Consumer<Integer>() {
//			
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//		};
		
		
//		Consumer<Integer> c = (Integer i) -> System.out.println(i);
		
		// Iterable i/f
		// new methods in existing interface would be defined as default
//		l.forEach(i -> System.out.println(i));
		
		// method reference
		//l.forEach(System.out::println); // call by value; 
										// call by reference;
										// call by method - method as reference
		
		
//		l.forEach(i -> doubleit(i));
		
//		l.forEach(Java8StreamApi :: doubleit);
		
		
//		int result = 0;
//		
//		for(int i : l) {
//			result = result + i * 2    ; // mutation - concurrency
//		}
		
//		System.out.println(result);
		
//		System.out.println(l.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
		
//		System.out.println(l.stream().map(i -> i * 2).reduce(0, (i, j) -> i + j));
		
//		System.out.println(l.stream().map(i -> i * 2).reduce(0, (i, j) -> Integer.sum(i, j)));
		
//		System.out.println(l.stream().map(i -> i * 2).reduce(0, Integer::sum));
		
		//param, returntype
		Function<Integer,Integer> f = new Function<Integer,Integer>(){
			public Integer apply(Integer i) {
				return i *2;
			}
		};
		
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
			public Integer apply(Integer i, Integer j) {
//				 result = result + i;
				 return i + j;
			}
		};
		
		Stream<Integer> s = l.stream();
		Stream<Integer> s1 = s.map(f);
//		Integer result = (Integer)s1.reduce(0, b);
		
//		System.out.println(result);
		
		
		
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		// imperative
		int result = 0;
		
		for(int i : values) {
			if(i%5 == 0) {
				result += i;
			}
		}
		
//		System.out.println(result);
		
//		System.out.println(values.stream()
//													.filter(i -> i%5 == 0)
//													.reduce(0, (c,	e) -> c + e));
		
//		System.out.println(values.stream()
//				.filter(i -> i%5 == 0)
//				.map(i -> i * 2)
//				.reduce(0, (c,	e) -> c + e));
		
		Predicate<Integer> p = new Predicate<Integer>() 
		{
			public boolean test(Integer i) {
				return i % 5 == 0;
			}
			
		};
		
//		System.out.println(values.stream()
//													.filter(p)
//													.reduce(0, (c,e) -> c + e));
		
//		List<Integer> list = Arrays.asList(6,88,99);
		List<Integer> list = Arrays.asList(6,5,2);
		
		
		// executes from down to top like: findFirst -->(give only first ele) map -->(give only first ele) filter
		System.out.println(list.stream()
										.filter(i -> i%5 == 0) // lazy evaluation
										.map(i -> i*2) // lazy evaluation
										.findFirst()
										.orElse(0));
		
	}
	
	
	public static void doubleit(int i) {
		System.out.println(i * 2);
	}
}
