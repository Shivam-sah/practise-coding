package com.Interview.JavaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java11Features {

	public static void main(String[] args) {
		
		
		Thread oddThread = new Thread(new oddNumber());
        Thread evenThread = new Thread(new evenNumber());

        // Starting both threads
        oddThread.start();
       // evenThread.start();	
        
        
		/*
		 * public class ForkInJavaExample {
		 * 
		 * public static void main(String[] args) { // Main thread starts
		 * System.out.println("Main thread started");
		 * 
		 * // Forking a new thread to perform a task Thread thread = new Thread(new
		 * Runnable() {
		 * 
		 * @Override public void run() { System.out.println("Forked thread started");
		 * try { Thread.sleep(1000); // Simulating some work } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 * System.out.println("Forked thread finished"); } });
		 * 
		 * thread.start(); // Start the forked thread
		 * 
		 * // Main thread continues to run System.out.println("Main thread continues");
		 * 
		 * try { thread.join(); // Wait for the forked thread to finish } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 * 
		 * System.out.println("Main thread finished"); } }
		 */
        
        
		/*
		 * Main Thread: The main method is the main thread of execution. Forking a New
		 * Thread: A new thread is created using Thread thread = new Thread(...), which
		 * accepts a Runnable that contains the task you want the new thread to perform.
		 * thread.start(): This starts the execution of the new thread, meaning it will
		 * run concurrently with the main thread. thread.join(): This ensures that the
		 * main thread waits for the forked thread to complete before finishing.
		 */

				 
		
		
		
		

	}
	
	
	
	public static class evenNumber implements Runnable{

		@Override
		public void run() {
			System.out.println("Even Numbers:");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();			
		}
		
	}
	
	public static class oddNumber implements Runnable{

		@Override
		public void run() {
			System.out.println("Odd Numbers:");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();			
		}
		
	}

}
