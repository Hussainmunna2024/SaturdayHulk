package com.Upskill.Java_4;

public class Encapsulation_1 {
	
	
	
	
	private String Name = "Muazzem";           // Write And Read
	private int mobileNumber = 929351080;
	private int SSN = 789-456-1234;           // Write Only
	private String Username = "Raselualam";
	private String Password = "Upskill123";  // Read Only
	
	
// Getter Method -Name
	public String getName() {         // Get the data, Read
		return Name;
	}

// Setter Method -Name
	public void setName(String value) {     // Set the data, Write
		Name = value;
	}
	
// Getter Method - MobileNumber
	public int getmobileNumber() {
		return mobileNumber;
	}
// Setter Method - SSN   
	
	public void setSSN(int Value) {  // Set the data, Write
		SSN = Value;
	}
	
	public String getUsername() { //  // Get the data, Read
		return Username;
	}
	
	public void setPassword(String Value) {  // Set the data, Write
		Password = Value;
	}
	
	public static void main(String[] args) {
		
		Encapsulation_1 obj = new Encapsulation_1();
		
		//obj.setName("Muazzem601");
		
		System.out.println(obj.getName());
		
		
		obj.setSSN(9999999);
		
		System.out.println(obj.getUsername());
			
		}
		
	}


