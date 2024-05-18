package com.Upskill.Java_2;

public class IfElseStatement_1 {

	public static void main(String[] args) {
		
		int age = 59;       // Declare Local Variable
		
		if (age < 14) {                                  // Conditional Statement 
			System.out.println("You are Children");
			
		}else if (age >= 14 && age <18) {
		   System.out.println("You are Teenager");
				
		}else if (age >= 60) {
			
			if(age >= 100) {                                 // Nested if else 
				System.out.print("You are buru");
				
			} else {
				
			}
		   System.out.println("You are Kuju Buru");	
			
		}else {
		   System.out.println("You are Adult");
		}

	}

}
