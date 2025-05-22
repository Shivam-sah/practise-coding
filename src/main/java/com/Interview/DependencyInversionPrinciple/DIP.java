package com.Interview.DependencyInversionPrinciple;


public class DIP {
	public static void main(String[] args) {
		
		Computer comp = new Computer(new WiredKeyBoard(),new BasicMonitor());
		comp.getKeyboard().run();
		comp.getMonitor().run();
	}

}
