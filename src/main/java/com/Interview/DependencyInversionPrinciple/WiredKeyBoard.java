package com.Interview.DependencyInversionPrinciple;

public class WiredKeyBoard implements Keyboard{

	@Override
	public void run() {
		System.out.println("This is Wired Keyboard");		
	}

}
