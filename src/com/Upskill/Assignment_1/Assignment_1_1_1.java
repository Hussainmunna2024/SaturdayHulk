package com.Upskill.Assignment_1;

public class Assignment_1_1_1 {
	/* A triangle three arms are: 5, 7 and 11 inches. 
	 Write a method to display the perimeter of triangle in console output.*/
	
	   // Method to calculate and display the perimeter of a triangle
    public static void displayTrianglePerimeter(int side1, int side2, int side3) {
        int perimeter = side1 + side2 + side3;
        System.out.println("The perimeter of the triangle with side lengths " + side1 + ", " + side2 + ", and " + side3 + " inches is: " + perimeter + " inches");
    }

    public static void main(String[] args) {
        // Given side lengths of the triangle
        int side1 = 5;
        int side2 = 7;
        int side3 = 11;

        // Call the method to display the perimeter of the triangle
        displayTrianglePerimeter(side1, side2, side3);
    }
}


