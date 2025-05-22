package com.Interview.StratergyDesignPattern;

public class StratergyDesign {

	public static void main(String[] args) {
		
		Vehicle normalVehicle = new NormalVehicle();
		normalVehicle.drive();
		
		Vehicle sportyVehicle = new SportyVehicle();
		sportyVehicle.drive();

	}

}
