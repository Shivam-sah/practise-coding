package com.Interview.OpenClosedPrinciples;

public class Vehicle {
	
	private double value;

    public Vehicle(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    // Calculate vehicle value (base implementation)
    public double calculateValue() {
        return value; // No depreciation by default
    }

}
