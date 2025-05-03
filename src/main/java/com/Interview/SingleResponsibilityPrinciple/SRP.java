package com.Interview.SingleResponsibilityPrinciple;

public class SRP {

	public static void main(String[] args) {
		Vehicle firstCar = new Vehicle("Toyota", "Camry");

        PrintDetails v1 = new PrintDetails();
        AddToDb v2 = new AddToDb();
        
        v1.printDetails(firstCar);
        v2.addVehicleToDB(firstCar);
	}

}
