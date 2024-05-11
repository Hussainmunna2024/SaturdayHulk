package com.Upskill.Assignment_1;

public class Assignment_1_4 {
	
	/*A function returns 30, another function returns 50. 
	 Write a java program which will display subtraction value from bigger number to smaller.*/
	
	// Function that returns 30
    public static int returnThirty() {
        return 30;
    }

    // Function that returns 50
    public static int returnFifty() {
        return 50;
    }

    public static void main(String[] args) {
        // Get the values returned by the functions
        int num1 = returnThirty();
        int num2 = returnFifty();

        // Determine the larger and smaller numbers
        int larger = Math.max(num1, num2);
        int smaller = Math.min(num1, num2);

        // Calculate the subtraction value from the larger to the smaller number
        int subtractionValue = larger - smaller;

        // Display the subtraction value
        System.out.println("Subtraction value from the larger number to the smaller number is: " + subtractionValue);
}
}
