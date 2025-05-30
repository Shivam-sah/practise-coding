package com.Interview.JavaConcepts;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lambdaDemo {
	
	/*
	 * A lambda expression is a short block of code which takes in parameters and 
	 * returns a value. Lambda expressions are similar to methods, but they do not 
	 * need a name and they can be implemented right in the body of a method.
	 */
	
	
	
	/*
	 * Advantage
	 * 
	 * 1. Concise and readable code.
	 * 2. Encourages use of stream api.
	 * 3. Introduce functional programming using stream methods.
	 */
	
	
	
	
	/*
	 * Built In Interfaces
	 * 
	 * 1. Function  = It represents a function that takes a single input & returns a single output.
	 */
	
		Function<Integer,Integer> func = (Integer val) -> {
		return val*2;
		};
		
		
		
	/*	
	 * Predicate  = it represents a function that takes a parameter and return a boolean value.
	 */
	
	 Predicate<Integer> predi = (Integer n ) -> {
		 return n%2 == 0;
	 };
	 
	 
	 /*
	  * Supplier = It is function that produces a values without taking any input.
	  */
	 
	 Supplier<Integer> supp = () -> {
		 return 5;
		 
	 };
	 
	 /*
	  * Consumer It is a function that consumes a value without returning anything.
	  */
		
	@FunctionalInterface
	interface Demo{	
		
	//	public void run();
		public int add(int a , int b);
		
	}
	
	

	public static void main(String[] args) {
		
	// This is annonymous inner class a way for implementing functional interfaces 	
				
//		Demo example = new Demo() {
//			@Override
//			public void run() {
//				System.out.println("This is annonymous inner class");
//			}
//
//	};
	
	
	Demo example  =  (int a ,int b) -> {
		return a+b;
	};
	
	
	

	}
}
