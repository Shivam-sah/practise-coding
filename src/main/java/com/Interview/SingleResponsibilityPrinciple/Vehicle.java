package com.Interview.SingleResponsibilityPrinciple;

public class Vehicle {
	
/*	Every
	class in
	Java should
	have a
	single job to do.
	To be precise,
	there should
	only be
	one reason
	to change a class.

	The Vehicle

	class has
	three separate responsibilities:reporting,calculation,
	and database.
	By applying SRP,
	we can
	separate the above

	class into
	three classes
	with separate responsibilities. */
	
/*	public void printDetails() {
		
	};
    public double calculateValue() {
    	return (Double) null;
    };
    public void addVehicleToDB() { 
    	
    }; */
	
	
	
	private String make;
    private String model;

    // Constructor
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }


}
