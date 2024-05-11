package com.Upskill.Java_4;

/* 	Polymorphism is the ability of an object to take on many forms.
- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

public class Polymorphism {

	public static void main(String[] args) {
		car(7, "23.5");
		
	}
	
	
	public static void car() {
		System.out.println("My car is Audi ! ");
	}

	
	public static void car(int door) {
		System.out.println(" Audi has four door : " + door);
	}
	
	public static void car(String Color ) {
		System.out.println("Audi color is White : " + Color);
	}
	
	public static void car(Boolean  DoubleMotor ) {
		System.out.println(" Audi has double Motor :" + DoubleMotor);
	}
	public static void car(int Seat, String headlightPower ) {
		System.out.println(" Audi has : " + Seat + " Seat" + " and headlight power : " + headlightPower + " Watt");
	}
}
