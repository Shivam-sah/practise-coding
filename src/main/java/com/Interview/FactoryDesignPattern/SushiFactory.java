package com.Interview.FactoryDesignPattern;

public class SushiFactory implements DishFactory{

	@Override
	public Dish createDish() {
		return new Sushi();
	}

}
