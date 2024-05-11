package com.Upskill.Assignment_1;

public class Assignment_1_1 {
	
	
	/* A triangle three arms are: 5, 7 and 11 inches. 
	 Write a method to display the perimeter of triangle in console output.*/  
	
	//Triangle
	//Solve for perimeter
	//P=a+b+c
	
	public static void main(String[] args) {
		trianglePremeter();
	}

	public static void trianglePremeter() {
		int m = 5;
		int r = 7;
		int g = 11;
		int perimeter = m+r+g;
		System.out.println("The Perimeter of the Triangle with arms 5,7,11 is " + perimeter);
		
		System.out.println("The perimeter of the triangle with side lengths " + m + ", " + r + ", and " + g + " inches is: " + perimeter + " inches");
	}

}
