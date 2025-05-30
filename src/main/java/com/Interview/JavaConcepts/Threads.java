package com.Interview.JavaConcepts;


public class Threads {
	
	public static class Mythread extends Thread{		
		@Override
        public void run() {
            System.out.println("Extending Thread Class is running");
        }
		
	}
	 
	
	public static class Mythread1 implements Runnable{
		/*
		 * This is the best way of creating threads as it allows your class to inherit 
		 * other class.
		 * 
		 * Resource Sharing -> You can easily share a single runnable instance among multiple threads.
		 * 
		 */
				
		@Override
		public void run() {
			System.out.println("Implementing Runnable Thread Class is running");			
		}		
	}
	
	public static void main(String[] args) {

		
		Mythread thread = new Mythread();
		thread.start();
		
		Mythread1 thread1 = new Mythread1();
		Thread thread2 = new Thread(thread1);
		thread2.start();
		
		// Lambda Thread Created
        Thread thread3 = new Thread(() -> {
        	System.out.println("Lambda Expression Thread Class is Running Thread Class is running");
        });
        
	}

}
