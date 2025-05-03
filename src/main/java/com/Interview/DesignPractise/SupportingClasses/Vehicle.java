package com.Interview.DesignPractise.SupportingClasses;

public class Vehicle {
	private String make;
    private String model;
       
	public Vehicle(String make, String model) {
		super();
		this.make = make;
		this.model = model;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
       
}
