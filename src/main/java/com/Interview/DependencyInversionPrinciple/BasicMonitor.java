package com.Interview.DependencyInversionPrinciple;

public class BasicMonitor implements Monitor {

	@Override
	public void run() {
		System.out.println("This is Basic Monitor");		
	}

}
