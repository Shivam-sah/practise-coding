package com.Interview.OpenClosedPrinciples;

public class Car extends Vehicle{
	
	public Car(double value) {
        super(value);
    }
	
	// Override calculateValue for cars (80% depreciation)
    @Override
    public double calculateValue() {
        return super.calculateValue() * 0.8; // Apply 80% depreciation
    }

}
