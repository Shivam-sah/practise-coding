package com.Interview.DependencyInversionPrinciple;

public class LedMonitor implements Monitor {
	
	@Override
	public void run() {
		System.out.println("This Is LED Monitor");	
	}

}
