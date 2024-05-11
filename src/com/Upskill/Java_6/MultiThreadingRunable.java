package com.Upskill.Java_6;

public class MultiThreadingRunable implements Runnable {
	
	// Interrupted Exception. 

	@Override
	public void run() {
		
		try {
		    System.out.println("Thread number # " + Thread.currentThread().getId());
		}
		
		catch(Exception e) { 
			e.printStackTrace();
			System.out.println("Exception is caught");
			
		}
		
		
		
	}

	

}