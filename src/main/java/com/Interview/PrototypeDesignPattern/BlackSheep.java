package com.Interview.PrototypeDesignPattern;

public class BlackSheep implements Sheep{
	
	public String name;
	
	public Sheep clone() {
        return new BlackSheep(this.name);
    }

	public BlackSheep(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

}
