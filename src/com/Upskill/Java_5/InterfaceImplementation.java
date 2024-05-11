package com.Upskill.Java_5;

/*Any class can extend only 1 class, 
*but can any class implement an infinite number of interfaces.
*/


public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		System.out.println("My car has 4 door");
	
		
	}

	@Override
	public int iWheels() {
		int Wheels =4; 
		return 4;
	}

	@Override
	public String iColor() {
		String Color = "Blue";
		return "Blue";
	}
	
	
	

	
	

}
