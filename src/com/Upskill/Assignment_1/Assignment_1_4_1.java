package com.Upskill.Assignment_1;

public class Assignment_1_4_1 {
	
	/*A function returns 30, another function returns 50. 
	 Write a java program which will display subtraction value from bigger number to smaller. */
	
	 public static int returnThirty() {
	 return 30;
	 }
	 
	 public static int returnFifty() {
	 return 50;
	 }

	public static void main(String[] args) {
		
		int subtractionValue = returnFifty() - returnThirty();
		
		System.out.println("Subtraction value from the larger number to the smaller number is: " + subtractionValue);
		
	}

} 
