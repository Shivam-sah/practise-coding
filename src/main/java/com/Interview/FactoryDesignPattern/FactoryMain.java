package com.Interview.FactoryDesignPattern;

public class FactoryMain {
	public static void main(String[] args) {
		
		/*
		 * It is a creational design pattern that provides an interface for creating objects 
		 * in a superclass but allows subclasses to alter the type of objects that will 
		 * be created.
		 * 
		 * This pattern helps in creating objects without specifying their concrete classes,
		 * making the code more flexible, robust, and easier to extend. 
		 */
		
		
		
		
        // Order a pizza using the PizzaFactory
        DishFactory pizzaFactory = new PizzaFactory();
        Dish pizza = pizzaFactory.createDish();
        pizza.prepare();
        pizza.serve();

        // Order sushi using the SushiFactory
        DishFactory sushiFactory = new SushiFactory();
        Dish sushi = sushiFactory.createDish();
        sushi.prepare();
        sushi.serve();
    }

}
