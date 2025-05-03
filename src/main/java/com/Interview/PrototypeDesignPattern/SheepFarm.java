package com.Interview.PrototypeDesignPattern;

public class SheepFarm {

	public static void main(String[] args) {
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
