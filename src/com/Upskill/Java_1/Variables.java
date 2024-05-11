package com.Upskill.Java_1;

public class Variables {
	
	public String country = "USA";          // Global Variable
	public static String region = "North America";   // Static variable 
	
	// Variable in java 
	
	// Instance Variable or global Variable - Variable declare in class level, outside method
	
	// Local variable - Variable declared in methods
	
	// Static variables - Variables belong to class and don't required creating object
	
	// Method parameter - Variable used as method parameter
	
	
	public static void main(String[] args) {
		
		Ny("King", 200000);
		Nj("Essex");
		Ct("Palm Beach");
		
	Variables myobj = new Variables();         // ClassName objectName = new ClassName();
	System.out.println(myobj.country);
	System.out.println(region);
		
	}
	
	public static void Ny(String county, int Population) {
		String city = "Brooklyn";            // local variable - Variable declared in method 
		System.out.println(city);
		
		
		String mycounty1 = county;      
		System.out.println(county);
		
		
	}
	public static void Nj(String county) {
		String city = "Bloomfield";
		System.out.println(city);
		
		String mycounty = county;
		System.out.println(county);
		
	}
	
	public static void Ct(String county) {
		String city = "Hartford";
		System.out.println(city);
		
		String mycounty2 = county;
		System.out.println(county);

	
	}
}
	


