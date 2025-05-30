package com.Interview.JavaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVSFlatmap {

	public static void main(String[] args) {
		List<String> sentences = List.of(
			    "Java is awesome",
			    "Streams are powerful"
			);

		
		// It Produces a stream of values.
		
		List<Stream<String>> mapped = sentences.stream()
			    .map(sentence -> Arrays.stream(sentence.split(" ")))
			    .collect(Collectors.toList());

			System.out.println(mapped.size()); 
			
		// Return Stream of Stream values
			
		List<String> flatMapped = sentences.stream()
				    .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
				    .collect(Collectors.toList());

		System.out.println(flatMapped);
				// Output: [Java, is, awesome, Streams, are, powerful]
	


	}

}
