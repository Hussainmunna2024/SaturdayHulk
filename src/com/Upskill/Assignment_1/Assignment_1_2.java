package com.Upskill.Assignment_1;

public class Assignment_1_2 {
/*A rectangle width and length are: 9 and 13 inches. 
 * Write a method to display the perimeter of rectangle in console output.*/
	
	//Perimrter of Rectangle
	//Solve for Perimeter
	//P=2(l+w)

public static void main(String[] args) {
	rectanglePerimeter();
}
   public static void rectanglePerimeter() {
	   int width = 9;
	   int length = 13;
	   int  perimeter = 2*(length+width);

        System.out.println("The Perimeter of the rectangle with width and length 9 and 13 is: " + perimeter);
        
        
        
        System.out.println("The perimeter of the rectangle with width " + width + " inches and length " + length + " inches is: " + perimeter + " inches");
    }


}


