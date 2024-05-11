package com.Upskill.Java_5;

/*Abstract classes cannot be instantiated/implemented by regular class
, but they can be extends by regular class*/

public class AbstractClassImplementation extends AbstractClass {

	@Override 
	public void iDoor() {
		int door =4;
		
	}

	@Override
	public int iWheels() {
		int wheel = 4;
		return wheel;
		
		
	}
	@Override
	public String iEngine() {
		String engine = "2300hp";
		return engine;
	}

	
}
