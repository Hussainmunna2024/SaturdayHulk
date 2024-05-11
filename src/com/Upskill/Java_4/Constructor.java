package com.Upskill.Java_4;

public class Constructor {
	
	/* Constructor is instance of a Class, method same as class name, Java will execute constructor first
	 - Constructor cannot be static or override nor void or return type. 
	 - Default Constructor : No Constructor is initialized. 
	 - Parameterized Constructor : Add different signature.
	 - Constructor overloading : Different Signature. 
	  */
	
	//An instance of a class is an object. It is also known as a class object or class instance.
	//As such, instantiation may be referred to as construction.
	String StudentName ;
	
	int StudentAge;
	
	
	
	public Constructor(String Name) {
		StudentName = Name;
	}
	
	public Constructor(int Age) {
		StudentAge = Age;
	}
	
	public Constructor(String name,int Age) {
		StudentName = name;
		StudentAge = Age;
	}
	public static void main(String[] args) {
		
		Constructor obj = new Constructor("Muazzem");
		System.out.println(obj.StudentName);
		
		Constructor obj1 = new Constructor(25);
		System.out.println(obj1.StudentAge);
		
		Constructor obj2 = new Constructor("Muazzem" ,25);
		System.out.println(obj2.StudentName);
		System.out.println(obj2.StudentAge);
	}

}
