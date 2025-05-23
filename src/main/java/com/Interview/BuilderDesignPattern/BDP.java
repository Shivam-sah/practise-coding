package com.Interview.BuilderDesignPattern;

public class BDP {

	public static void main(String[] args) {
		
		/*
		 * Today we will look into Builder pattern in java. Builder design pattern is a creational 
		 * design pattern like Factory Pattern and Abstract Factory Pattern.
		 * 
		 * Too Many arguments to pass from client program to the Factory class that can be error 
		 * prone because most of the time, the type of arguments are same and from client side 
		 * its hard to maintain the order of the argument.
		 * 
		 * 	Some of the parameters might be optional but in Factory pattern, we are forced to 
		 *	send all the parameters and optional parameters need to send as NULL.		
		 * 
		 * If the object is heavy and its creation is complex, then all that complexity will 
		 *	be part of Factory classes that is confusing
		 * 
		 */
		
		//Using builder to get the object in a single line of code and 
        //without any inconsistent state or arguments management issues		
		Computer comp = Computer.builder().setHDD("265 GB")
				.setRAM("16 GB")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true)
				.build();
		
		System.out.println(comp);
		
		
		
		
		
		
		

	}

}
