package com.Upskill.Java_6;

public class SingletonUse {
	
// It is not possible for you to inherit a singleton class: public class SingletonUse extends Singleton {
	
// A usual Singleton class object cannot be created.
	
	public static void main(String[] args) {
		
		// Singleton obj = new Singleton();	
		

        // Instantiating Singleton class with variable y
		
		Singleton y = Singleton.getInstance();
		y.demo();
		
		
	}

}
