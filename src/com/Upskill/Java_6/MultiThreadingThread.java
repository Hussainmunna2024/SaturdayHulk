 package com.Upskill.Java_6;

public class MultiThreadingThread extends Thread {
	
	public void run() { 
		
	try {
	    System.out.println("Thread # " + Thread.currentThread().getId());
	}
	
	catch(Exception e) { 
		e.printStackTrace();
		System.out.println("Exception is found");
		
	 }
   }

 }
