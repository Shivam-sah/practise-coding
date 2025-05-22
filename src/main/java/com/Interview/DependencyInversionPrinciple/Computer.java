package com.Interview.DependencyInversionPrinciple;


public class Computer {	
	/*
	 *  A Class Should Depend On Interfaces and abstrat classes rather then Concrete implementation.
	 *  
	 */
	private  Keyboard keyboard;
	private Monitor monitor;
	
    public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
   
    public Computer(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

}
