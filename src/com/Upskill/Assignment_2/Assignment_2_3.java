package com.Upskill.Assignment_2;


/* 3. Write two java functions which will return two different integer values, write a 
     program to compare those numbers and send message that one number is bigger 
     than other. (hints: using if..else)  */

public class Assignment_2_3 {
	
	public static void main (String[]args) {
		CompareNumbers();
		
		}
	
	
	public static int FirstNumber() {
		return 30;
	}
	
	public static int SecondNumber() {
		return 35;
	}
	
	public static void CompareNumbers() {
		
	if( FirstNumber() > SecondNumber()) {
		
		System.out.println("The first number (" + FirstNumber() + ") is bigger than the second number (" + SecondNumber() + ").");
		
	  }
	
	else if( FirstNumber() < SecondNumber()) {
		System.out.println("The first number (" + SecondNumber() + ") is bigger than the second number (" + FirstNumber() + ").");
		
	}
	
	else {
        System.out.println("The two numbers (" + FirstNumber() + " and " + SecondNumber() + ") are equal.");
	}

	}
  }
