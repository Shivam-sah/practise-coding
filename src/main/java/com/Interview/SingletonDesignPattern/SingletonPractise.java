package com.Interview.SingletonDesignPattern;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonPractise {

	public static void main(String[] args) throws Exception {
		
		Singleton instanceOne = Singleton.getInstance();
		Singleton instanceTwo = (Singleton) Singleton.getInstance().Clone();
		System.out.println("Hashcode of Object 1: " + instanceOne.hashCode());
        System.out.println("Hashcode of Object 2: " + instanceTwo.hashCode());
		
        
        
//		Singleton instanceOne = Singleton.getInstance();
//        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
//        out.writeObject(instanceOne);
//        out.close();
//
//        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
//        Singleton instanceTwo = (Singleton) in.readObject();
//        in.close();
//
//        System.out.println("Hashcode of Object 1: " + instanceOne.hashCode());
//        System.out.println("Hashcode of Object 2: " + instanceTwo.hashCode());

        
        
				
//		Singleton instanceOne = Singleton.getInstance();
//        Singleton instanceTwo = null;
//        try {
//            Constructor constructor = Singleton.class.getDeclaredConstructor();
//            constructor.setAccessible(true);
//            instanceTwo = (Singleton) constructor.newInstance();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        System.out.println("Hashcode of Object 1: " + instanceOne.hashCode());
//        System.out.println("Hashcode of Object 2: " + instanceTwo.hashCode());
        
        
        
	}

}
