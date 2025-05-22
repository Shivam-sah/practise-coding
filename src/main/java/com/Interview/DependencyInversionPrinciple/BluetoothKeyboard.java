package com.Interview.DependencyInversionPrinciple;

public class BluetoothKeyboard implements Keyboard{

	@Override
	public void run() {
		System.out.println("This is Bluetooth Keyboard");		
	}

}
