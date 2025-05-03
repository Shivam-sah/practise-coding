package com.Interview.OpenClosedPrinciples;

public class OCP {
	public static void main(String[] args) {
		
	/*	Software entities (e.g., classes, modules, functions) should be 
		open for an extension, but closed for modification. */
				
        Car myCar = new Car(25000.0);
        Truck myTruck = new Truck(35000.0);

        System.out.println("Car Value: $" + myCar.calculateValue());
        System.out.println("Truck Value: $" + myTruck.calculateValue());
    }
}
