package com.Interview.PrototypeDesignPattern;

public class SheepFarm {

	public static void main(String[] args) {
		/*
		 * The Prototype design pattern is a creational pattern that creates new objects by cloning existing 
		 * ones instead of creating them from scratch. This approach is particularly useful when object 
		 * creation is complex, time-consuming, or resource-intensive.
		 */
		 		
		
		// Create prototype sheep
        Sheep blackPrototype = new BlackSheep("Baa Baa");
        Sheep whitePrototype = new WhiteSheep("Fleecy");

        // Clone sheep as needed
        Sheep clonedBlackSheep = blackPrototype.clone();
        Sheep clonedWhiteSheep = whitePrototype.clone();

        // Customize cloned sheep
        clonedBlackSheep.setName("Midnight");
        clonedWhiteSheep.setName("Snowball");
        
        
        // Your sheep farm is thriving!
        System.out.println("Black sheep HashCode: " +blackPrototype.hashCode() + " and Name: "+ blackPrototype.getName());
        System.out.println("White sheep HashCode: " +whitePrototype.hashCode() + " and Name: "+ whitePrototype.getName());

        // Your sheep farm is thriving!
        System.out.println("Cloned Black sheep HashCode: " + clonedBlackSheep.hashCode() + " and Name: " + clonedBlackSheep.getName());
        System.out.println("Cloned white sheep HashCode: " + clonedWhiteSheep.hashCode() + " and Name: " + clonedWhiteSheep.getName());
	}

}
