package com.Interview.JavaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Streams {

	public static void main(String[] args) {
		/*
		 * 1. Stream do not manipulate the original data.
		 * 
		 * 2. Once the stream is consumed it can not be used again.
		 * 
		 */
		
		
		Function<Integer, Integer> func = (Integer n) -> {
			return n*2;
			};
		
				
		List<Integer> nums = Arrays.asList(4,5,7,8,9);
		
		int ans = nums.stream()
		.filter(n -> n%2 == 0)
		.map(func)
		.reduce(0,(a,b) -> a+b);
		
		

	}

}
