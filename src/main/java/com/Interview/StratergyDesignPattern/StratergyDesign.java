package com.Interview.StratergyDesignPattern;

public class StratergyDesign {

	public static void main(String[] args) {
		
		/*
		 * The Strategy Design Pattern is a behavioral design pattern that enables selecting an 
		 * algorithm's behavior at runtime.
		 * 
		 */
		
		Vehicle normalVehicle = new NormalVehicle();
		normalVehicle.drive();
		
		Vehicle sportyVehicle = new SportyVehicle();
		sportyVehicle.drive();

	}

}
