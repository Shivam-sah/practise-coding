package com.Interview.JavaConcepts;

import java.util.Comparator;

import com.Interview.JavaCodingQuestion.Employee;

public class ComparableVSComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge() - o2.getAge();
	}

}
