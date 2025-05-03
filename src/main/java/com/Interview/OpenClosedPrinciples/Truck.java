package com.Interview.OpenClosedPrinciples;

public class Truck extends Vehicle{
	
	public Truck(double value) {
        super(value);
    }
	
	// Override calculateValue for trucks (90% depreciation)
    @Override
    public double calculateValue() {
        return super.calculateValue() * 0.9; // Apply 90% depreciation
    }
}
