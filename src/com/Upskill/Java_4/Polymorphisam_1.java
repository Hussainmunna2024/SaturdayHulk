package com.Upskill.Java_4;

import com.Upskill.Java_1.MethodType;

public class Polymorphisam_1 extends MethodType {

	public static void main(String[] args) {
		
		Polymorphisam_1 Polymorphi = new Polymorphisam_1();
		Polymorphi.annualIncomeVoid();
	
		car();
		car("Blue");
		car("Blue", 4);
		car(4);
		
	}
	
	public void annualIncomeVoid() {
		int rentalIncome = 24000;
		int cripto = 200000;
		int business = 25000;
		int calculationAnnualIncome = hourlyincome * 2000 + rentalIncome + cripto + business;
		System.out.println("My Annual Income = " + calculationAnnualIncome);
		
	}
	public static void car() {
		System.out.println("My car is Audi ! ");
	}

	
	
	public static void car(String Color ) {
		System.out.println("Audi color is  : " + Color);
	}
	
	public static void car(String Color, int door ) {
		System.out.println("Audi color is " + Color + ", It has : " + door);
	}
	
	public static void car(int Seat ) {
		System.out.println("It has " + Seat+ " Seat ");
  }
}