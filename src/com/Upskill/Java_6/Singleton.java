package com.Upskill.Java_6;

public class Singleton {
	
	// Singleton means: a person or thing occurring singly
	// a child or animal that is the only one born at one birth: 
	
	// Singleton is class that can have only one object.
	
	/*Remember the key points while defining a class as a singleton class that is 
	 * while designing a singleton class:
	 */
	
	// 1.  Make a constructor private.
	// 2. Write a static method that has the return type object of this singleton class. 
	
	private Singleton() {
		
	}
	
	// Private static object of the class
	
	private static Singleton SingletonObj = new Singleton();
	
/*The getInstance() method is a static method of the Signature class 
 * that returns an instance of the Signature class that implements the specified signature algorithm. 
 */
	
	public static Singleton getInstance() {
		return SingletonObj;
		
	}
	
	protected static void demo() {
		System.out.println("Demo method for Singleton Class");
	}

}
