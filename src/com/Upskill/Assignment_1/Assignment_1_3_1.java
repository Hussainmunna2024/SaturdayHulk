package com.Upskill.Assignment_1;

public class Assignment_1_3_1 {

    
    // Function to return the product of a and b
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Given values for a and b
        int a = 9;
        int b = 11;

        // Calculate the sum of a, b, and the result of the function
        int result = a + b + multiply(a, b);

        // Display the result
        System.out.println("The sum of " + a + " + " + b + " + (" + a + " * " + b + ") is: " + result);
    }
}


