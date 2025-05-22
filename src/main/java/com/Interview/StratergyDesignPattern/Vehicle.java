package com.Interview.StratergyDesignPattern;

public class Vehicle {
	public DriveStratergy driveStratergy;
	
	public Vehicle(DriveStratergy driveStratergy) {
		this.driveStratergy = driveStratergy;
	}
	
	public void drive() {
		driveStratergy.drive();
	}
}
