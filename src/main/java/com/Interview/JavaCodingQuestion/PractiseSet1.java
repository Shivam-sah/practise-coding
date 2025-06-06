package com.Interview.JavaCodingQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PractiseSet1 {

	public static void main(String[] args) {
		
		String input = "HelloWorld";
		String input1 = "Java Concept Of The Day";
		
		Integer []arr = {71, 18, 42, 21, 67, 32, 95, 14, 56, 87, 71, 30, 45, 60};
		Integer []arr1 = {17, 81, 24, 12, 76, 23, 59, 41};		
		int []arr2= {71, 18, 42, 21, 67, 32, 95, 14, 56, 87, 71, 30, 45, 60};
		int []arr3 = {17, 81, 24, 12, 76, 23, 59, 41};
		
		
		List<Integer> integerList = Arrays.asList(arr);
		List<Integer> integerList1 = Arrays.asList(arr1);
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");		
		List<String> listOfStrings1 = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		
		
		
		/*
		 *  write a code to add two numbers using lambda expressions
		 *  
		 */
				
		BiFunction<Integer,Integer,Integer> add = (a , b) -> a + b; 
		System.out.println(add.apply(2, 5));
		
		/*
		 * Write a Java 8 program using peek to print processed elements during a stream operation.
		 * 
		 */
		
		integerList.stream()
					.peek(n -> System.out.println(" Processing "+  n ))
					.map(n -> n*2)
					.forEach(System.out::println);
		
				
		/*
		 *  Seprate Odd Even Numbers
		 */
		Map<Boolean,List<Integer>> res1 = integerList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));		
		//System.out.print(res1);
			
		
		/*
		 *  remove duplicate Elements
		 */
		List<Integer> res2 = integerList.stream().distinct().collect(Collectors.toList());
		//System.out.println(res2);
		
		/*
		 *  Frequency of each character in a String 
		 * 
		 * chars()----> returns an intsream of charcter
		 * mapToObj --- > convert an intstream into stream
		 */
		  Map<Character,Long> res3 = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		 // System.out.println(res3);
		  
		  /*
		   * Frequency Of each element in an array
		   * 
		   */
		  Map<Integer,Long> res4 = integerList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 // System.out.println(res4);
		  
		  /*
		   * sort in reverse order
		   */
		  List<Integer> res5 = integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//  System.out.println(res5);
		  
		  /*
		   *  Print Multiples Of 5.
		   */
		  
		  integerList.stream().filter( i -> i % 5 == 0).forEach(i -> System.out.println(i));
		  
		  /*
		   *  Maximum in a list
		   */	
		  
		  Integer res7 = integerList.stream().max(Comparator.comparing(Function.identity(),Comparator.reverseOrder())).get();
		  System.out.println(res7);
		  
		  Integer res8 = integerList.stream().min(Integer::compareTo).get();
		  System.out.println(res8);
		  
		  /*
		   * Merge two Unsorted Array into single sorted array
		   */
		  		  
		 int[] res9 =  IntStream.concat(Arrays.stream(arr2), Arrays.stream(arr3)).sorted().distinct().toArray();
		 System.out.println(res9);
		  
		 /*
		  *  Three max and Three min number in a list.
		  */
		 
		List<Integer> res10 =  integerList.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(res10);
		
		List<Integer> res11 =  integerList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println(res11);
		
		/*
		 * Second largest Number in a Array
		 */
		 
		Integer res12 = integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(res12);
		
		/*
		 * Sort List Of String In Incresing Order of their length
		 */
		
		List<String> res13 = listOfStrings.stream().sorted(Comparator.comparing( String::length)).collect(Collectors.toList());
		System.out.print(res13);
		
		/*
		 *  Common Elements in two Arrays 
		 */
		
		List<Integer> res14 = integerList.stream().filter(i -> integerList1.contains(i)).collect(Collectors.toList());
		System.out.println(res14);
		
		/*
		 * Reverse Each Word Of a Stream Using java 8
		 */
		
		String res15 =Arrays.stream(input1.split(" "))
		.map(str -> new StringBuilder(str).reverse())
		.collect(Collectors.joining(" "));
		
		System.out.print(res15);
		
		/*
		 *  Sum of first 10 Numbers
		 */
		
		Integer res16 = IntStream.rangeClosed(1,10).sum();
		
		
		/*
		 *  First Non-Repeated Character In a String
	 	 *
		 */
		
		Map<Character,Long> res17 = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		Character firstNonRepeatedChar = res17.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
		
		System.out.println("-----"+firstNonRepeatedChar);
		
		
		Map<Character, Long> nonRepeatedChars = res17.entrySet()
			    .stream()
			    .filter(entry -> entry.getValue() == 1)
			    .collect(Collectors.toMap(
			        Map.Entry::getKey,
			        Map.Entry::getValue,
			        (e1, e2) -> e1,
			        LinkedHashMap::new  // Preserve order
			    ));
		
		System.out.println(nonRepeatedChars);
		
	}

}
