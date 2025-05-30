package com.Interview.JavaCodingQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import com.Interview.JavaConcepts.ComparableVSComparator;

public class PractiseSet2 {
	
	public static void main(String[] args) {		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));		
		
		
		
		Employee emp1 = new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020);
		Employee emp2 = new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		HashSet<Employee> set = new HashSet<>();
		System.out.println(set.add(emp1));
		System.out.println(set.add(emp2));
		
		System.out.println(set.size());
		
		Collections.sort(empList, new ComparableVSComparator());
		// OR
		empList.sort(new ComparableVSComparator());

		
		
		System.out.print(empList);
				
				
		/*
		 * 1. Group Employees By City
		 */
		
		Map<String,List<Employee>> groupByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println("1----> "+ groupByCity);
		
		
		/*
		 * 2. Group Employees By Age
		 */
		
		Map<Integer,List<Employee>> groupByAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
		System.out.println("2----> " + groupByAge);
		
		/*
		 * 3. Find The Count of Male And Female Employee
		 * 
		 */
		
		Map<String,Long> groupByGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("3----> " + groupByGender);
		
		
		/*
		 * 4. Print the name of all the departments
		 */
		
		List<String> allDepartments = empList.stream().map(emp -> emp.getDeptName()).distinct().collect(Collectors.toList());
		System.out.print("4 ----> "+ allDepartments);
				
		
		/*
		 * 5. Find Employee Details Whose age is greater then 25
		 * 
		 */
		
		empList.stream().filter(x -> x.getAge() > 25).collect(Collectors.toList()).forEach(System.out::println);
		
		
		/*
		 * 6. Find Employee With Maximum Age
		 * 
		 */		
		 Optional<Employee> emp = empList.stream().sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder())).findFirst();
		 System.out.println("6 -----> " + emp.get());
		
		 
		 /*
		  * 7. Average Age Of Male And Female Employees
		  */		

		Map<String, Double> average =  empList.stream().collect(Collectors.groupingBy(Employee::getGender , Collectors.averagingInt(Employee::getAge)));
		System.out.println(average);
		
		/*
		 * 8. Number Of Employee In Each Department
		 * 
		 */
		
		Map<String,Long> departmentemployees = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
		System.out.println(departmentemployees);
		
		/*
		 * 9 .  Youngest Female
		 * 
		 */
		Optional<Employee> youngestFemale = empList.stream().filter(x -> x.getGender().equals("F")).sorted(Comparator.comparing(Employee::getAge)).findFirst();
		System.out.println(youngestFemale.get());
		
		
		/*
		 * 10 . Find employees whose age is greater than 30 and less than 30.
		 */
		
		Map<Boolean,List<Employee>> age30 = empList.stream().collect(Collectors.partitioningBy(x -> x.getAge() >= 30 ));
		System.out.println(age30);
		
		/*
		 * 11 . Find the department which has highest number of employees
		 */
		
		Optional<Map.Entry<String, Long>> topDept = empList.stream().collect(Collectors.groupingBy(x -> x.getDeptName(),Collectors.counting()))
		.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst();
		
		System.out.print(topDept);
		
		
		/*
		 * 14. Find the department names that these employees work for,
		 *  where the number of employees in the department is over 3.
		 *  
		 */
		
		empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
		.entrySet().stream().filter(x -> x.getValue() > 3).forEach(System.out::println);
		
		
		
		
	}

}
