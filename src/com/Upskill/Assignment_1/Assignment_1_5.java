package com.Upskill.Assignment_1;

public class Assignment_1_5 {

	/*Write a java program which will display name and guesstimate age of every students in your class.
	 (write separate method for every student).*/
		
	   // Method to display the name and estimated age of Student 1
    public static void displayStudent1Details() {
        String name = "Alice";
        int estimatedAge = 20;
       System.out.println("Student 1 - Name: " + name + ", Estimated Age: " + estimatedAge);
    }

    // Method to display the name and estimated age of Student 2
    public static void displayStudent2Details() {
        String name = "Bob";
        int estimatedAge = 21;
       System.out.println("Student 2 - Name: " + name + ", Estimated Age: " + estimatedAge);
    }

    // Method to display the name and estimated age of Student 3
    public static void displayStudent3Details() {
        String name = "Cathy";
        int estimatedAge = 19;
        System.out.println("Student 3 - Name: " + name + ", Estimated Age: " + estimatedAge);
    }

    public static void main(String[] args) {
        // Call the methods to display details of each student
    	
    	
        displayStudent1Details();
        displayStudent2Details();
        displayStudent3Details();
    }
}



