package com.Upskill.Java_5;

public abstract class AbstractClass {
	
	/* Abstract class: is a restricted class that cannot be used to create objects 
	(to access it, it must be inherited from another class).*/
	
	/*Abstract method: can only be used in an abstract class, Also in interface class. 
	 * and it does not have a body. The body is provided by the subclass (inherited from).
	 */
	
	
// Abstract class has both abstract method and regular method  
	
	public abstract void iDoor();
	
	public abstract int iWheels();
	
	public abstract String iEngine();
	
	
	
	
	
	
	
	public void color(){
		String CarColor = "Blue";
	}
	
	public int seat() {
		return 8;
	}
	
}
