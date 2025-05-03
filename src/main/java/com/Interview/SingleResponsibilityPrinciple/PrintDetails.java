package com.Interview.SingleResponsibilityPrinciple;

public class PrintDetails {
	// Print vehicle details
    public void printDetails(Vehicle v) {
        System.out.println("Make: " + v.getMake());
        System.out.println("Model: " + v.getModel());
    }
}
