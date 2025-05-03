package com.Interview.SingleResponsibilityPrinciple;

public class AddToDb {	
	public void addVehicleToDB(Vehicle vehicle) {
        // Code to add the vehicle to the database
        System.out.println("Vehicle " + vehicle.getMake() + " " + vehicle.getModel() + " added to DB.");
    }
}
