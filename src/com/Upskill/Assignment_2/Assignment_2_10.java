package com.Upskill.Assignment_2;

//10. Write a Java program to convert temperature from Fahrenheit to Celsius degree. 

public class Assignment_2_10 {
	
	
	public static void main(String[]args) {
		
		double fahrenheit = 50.0; // Example Fahrenheit temperature
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        
        System.out.println(fahrenheit + " F is equal to " + celsius + " C ");
    }
    
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
		
		
	}

}
