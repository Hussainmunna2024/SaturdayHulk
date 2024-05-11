package com.Upskill.Java_6;

public class Exception_TryCatchFinally {
	
	
	/* Java exception - Use "try - catch - finally"
	 * 
A. Built-in Exceptions - Built-in exception throws by java which explain certain error situations

1. ArithmeticException - error has occurred in an arithmetic operation.
2. ArrayIndexOutOfBoundsException -  an array has been accessed with illegal index.
3. ClassNotFoundException - try to access a class whose definition is not found
4. FileNotFoundException - a file is not accessible or does not open.
5  IOException - input-output operation failed or interrupted
6. InterruptedException  - thread is waiting, sleeping, or doing some processing, and it is interrupted.
7. NoSuchFieldException - class does not contain the field or variable specified
8. NoSuchMethodException - accessing a method which is not found
9. NullPointerException - referring to the members of a null object
10.NumberFormatException  -  a method could not convert a string into a numeric format
11.RuntimeException - any exception which occurs during runtime.
12. StringIndexOutOfBoundsException -  String class methods to indicate that an index is either negative or greater than the size of the string

B. User-Defined Exceptions - User can also create exception where the error situations is not covered by java
*/

	public static void main(String[]args) throws myException {
		
// Built-in Exceptions - ArrayIndexOutOfBound Exception. 
	try {

		int[] ageGroup = new int[]{25, 35, 32, 38, 40, 45};

		System.out.println("Student Age = "+ ageGroup[5]);

} catch (Exception e) {

		System.out.println(" Array Index Out of Bounds, Please check array index");

		e.printStackTrace();
		
//The printStackTrace() method in Java is a tool used to handle exceptions and errors.
}
	
	//Built-in Exceptions - NumberFormatException

	 try {

			int num = Integer.parseInt("6");

			System.out.println("Value of num int = " + num);

	} catch (NumberFormatException e) {
		
		e.printStackTrace(); 
		
        System.out.println("Please make sure input string is a number");

			
			
	// printStackTrace: The printStackTrace() method in Java is a tool used to handle exceptions and errors.
    }
	 
// User Defined Exception 

	 try { 
			throw new myException("Test");

		} catch (myException e){
			
			e.printStackTrace();

			System.out.println("Test User Defined Exception, error message !!!");
		}
			
	

finally {
		 System.out.println("Complete Java Exception Handling");
	  }
    }
  }