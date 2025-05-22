package com.Interview.LiskOPSubstitutionPrinciple;

public class LSP {	
	public static void main(String[] args) {
		/*	The Liskov Substitution Principle (LSP) applies to inheritance hierarchies 
		such that derived classes must be completely substitutable for their base classes.*/
		
		/*
		 * A child class should not violate the behavior of the parent class.
		 */
		
		Shape rectangle = new Rectangle(7.0, 5.0);
	    Shape square = new Square(3.0);

	    System.out.println("Rectangle Area: " + rectangle.getArea());
	    System.out.println("Square Area: " + square.getArea());
    }
	
}
