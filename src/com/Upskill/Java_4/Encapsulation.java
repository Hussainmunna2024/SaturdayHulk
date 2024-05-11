package com.Upskill.Java_4;

public class Encapsulation {
	
	// Encapsulation used to hide the data using setter and getter 
	
	// Encapsulation in java is a process of grouping of data members and corresponding methods into a single unit. 
	
	// Basically Encapsulation is used to bind the data members and methods together into a single unit. 
	
	
	private String Name = "Muazzem";
	private int mobileNumber = 929351080;
	private int SSN = 789-456-1234;
	private String Username = "Upskill";
	private String Password = "Upskill123";
	
	// Getter method for "Name" to access private variable "Name". 
	
	
	public String getName() {
		return Name;
	}
	
	// Setter method for "Name" to set value in Private variable "Name". 
	
	/*public void setName(String Name) {
		this.Name = Name;
	}*/
	
	// Setter method for "Name" to set value in Private variable "Name". 
	
		public void setName(String value) {
			Name = value;
		}
		
		
		public int getmobileNumber() {
			return mobileNumber;
		}
		
		/*public void setSSN(int SSN) {
			this.SSN = SSN;
		}*/
		
		public void setSSN(int Value) {
			SSN = Value;
		}
		
		public String getUsername() {
			return Username;
		}
		
		public void setPassword(String Value) {
			Password = Value;
		}
		
		

}
