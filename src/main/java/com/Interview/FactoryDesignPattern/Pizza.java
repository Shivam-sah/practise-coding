package com.Interview.FactoryDesignPattern;

public  class Pizza implements Dish{

	@Override
	public void prepare() {
		System.out.println("Preparing Pizza");
		
	}

	@Override
	public void serve() {
		System.out.println("Serving Pizza");		
	}

}
