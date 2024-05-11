package com.Upskill.Java_6;

public class MultiThreading {
	
/*Multithreading is a Java feature that allows concurrent execution of two or more parts of a program
 *  for maximum utilization of CPU
 *  
 *  1. Extending the Thread class 
 *  2. Implementing the Runnable Interface
 */
	
	public static void main(String[] args) {
		
		int n = 10;
		
		for(int i = 0; i < n; i++) {
		
		MultiThreadingThread obj = new MultiThreadingThread();
		obj.start();  // It starts the execution of the thread
		
		
		
		
		/*This example is devised by implementing the Runnable interface. 
		 * It differs from the last example because we had to create the Thread class object to use that with a start function.
		 * The output will be the same as the previous program. Below is the output.
		 */
		Thread obj1 = new Thread (new MultiThreadingRunable());
		obj1.start();  // It starts the execution of the thread
		
		

		
		
	}
  }

}
