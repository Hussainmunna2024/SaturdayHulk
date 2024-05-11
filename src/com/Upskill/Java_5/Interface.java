package com.Upskill.Java_5;

public interface Interface {
	
// Interface can have only abstract methods, java 8 and forward they have static method too. 
	
// Abstract method doesn't have any implementation. 
	
/*Since java does not support multiple inheritances in the case of class, 
 * by using an interface it can achieve multiple inheritances.
 */
	
/*Any class can extend only 1 class, 
 *but can any class implement an infinite number of interfaces.
 */

//In an interface, you can’t instantiate variables and create an object.  
	
	public abstract void iDoor();
	
	public abstract int iWheels();
	
	public abstract String iColor();
	
	
	
	
	
/* 
(Parents)         (Keyword)        (Child)           (Keyword)       (GrandChild)

Class              extend           Class
Abstract Class     extend           Class
Interface         implementation    Class
Interface         extend            Interface         implements       Class
 */

}
