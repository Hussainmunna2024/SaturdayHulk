package com.Upskill.Assignment_1;

public class Assignment_1_3 {
	
	/*A function which returns the multiply value of a and b where a = 9 and b = 11.     
	 *  Write a program which will display addition of a +b + function returns value.*/
	
	public static int multiply(int a, int b) {
		return a * b ;
		
	}
	
	public static void main(String[] args) {
		// Given values a and b
		int a = 9;
		int b = 11;
		
		// Calculate the sum of a,b, and the result of the function 
		
		int result = a + b + multiply (a,b);
	
		System.out.println("The resilt is " + result);
		
		System.out.println("The sum of " + a + " + " + b + " + (" + a + " * " + b + ") is: " + result);

	}
	
}	
