package com.Upskill.Assignment_1;

public class Assignment_1_2_1 {
	
/*A rectangle width and length are: 9 and 13 inches. 
 Write a method to display the perimeter of rectangle in console output. */
	
	// Method to calculate and display the perimeter of a rectangle
	
	public static void ShowRectanglePerimeter(int width, int length ) {
		int perimeter = 2 * (width + length);
        System.out.println("The perimeter of the rectangle with width " + width + " inches and length " + length + " inches is: " + perimeter + " inches");
		
	}

    public static void main(String[] args) {
        // Given width and length of the rectangle
        int width = 9;
        int length = 13;
        // Call the method to display the perimeter of the rectangle
        ShowRectanglePerimeter(width, length);

   }
}
