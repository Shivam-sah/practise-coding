package com.Interview.SingletonDesignPattern;

import java.io.Serializable;

//1. Clonning
//2. Deserialization
//3. Reflection


public class Singleton implements Cloneable,Serializable {
	private static volatile Singleton instance = null;

	private Singleton() {		
		if(instance != null) {
			throw new RuntimeException("Use Get Instance Method to Clone Objects");
		}		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}			
		}
		return instance;
	}
	
//	@Override
	protected Object Clone() throws CloneNotSupportedException{
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}			
		}
		return instance;		
	//	throw new CloneNotSupportedException("Clonning Is Not Allowed For Singleton");
	}
	
	public Object readResolve() {
        return instance;
    }	
}


