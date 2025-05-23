package com.Interview.BuilderDesignPattern;

public class Computer {

	
	   //required parameters
		private String HDD;
		private String RAM;
		
		//optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		

		public String getHDD() {
			return HDD;
		}

		public String getRAM() {
			return RAM;
		}

		public boolean isGraphicsCardEnabled() {
			return isGraphicsCardEnabled;
		}

		public boolean isBluetoothEnabled() {
			return isBluetoothEnabled;
		}
		
		
		
		public static ComputerBuilder builder() {
			return new ComputerBuilder();
		}
		
		
		//Builder Class
		public static class ComputerBuilder{

			// required parameters
			private String HDD;
			private String RAM;

			// optional parameters
			private boolean isGraphicsCardEnabled;
			private boolean isBluetoothEnabled;
			
			public ComputerBuilder(){
			}

			public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
				this.isGraphicsCardEnabled = isGraphicsCardEnabled;
				return this;
			}

			public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
				this.isBluetoothEnabled = isBluetoothEnabled;
				return this;
			}
			
			
			public ComputerBuilder setHDD(String HDD) {
				this.HDD = HDD;
				return this;
			}

			public ComputerBuilder setRAM(String RAM) {
				this.RAM = RAM;
				return this;
			}
			
			public Computer build(){
				Computer comp = new Computer();
				comp.HDD = this.HDD;
				comp.RAM = this.RAM;
				comp.isGraphicsCardEnabled = this.isBluetoothEnabled;
				comp.isBluetoothEnabled =  this.isBluetoothEnabled;
				return comp;
			}

		}
}
