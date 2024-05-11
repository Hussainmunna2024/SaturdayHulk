package com.Upskill.Java_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {
	
public static void main(String[]args) {
		
		// Array Store multiple data using index 
	
	   
		
		int age = 28;                                   // variable 
		
		int[] ageHulk = new int[] {22,26,27,28,31};   // Array
		
		// Array index                [0][1][2][3][4]
		
		System.out.println("Student age: " + ageHulk[2]);
		System.out.println("Toatal Student : " + ageHulk.length); // .length will give you total value that stored inside the array. 
		
		// Write an Array for Student name NameHulk (String data type)
		
		String[] NameHulk = new String[] {"Mohammed", "Showrav", "Munna"};
		System.out.println("Student Name is: " + NameHulk[1]);
		System.out.println("Toatal Student is " + NameHulk.length);
		System.out.println("All Three Student Name : " + Arrays.toString(NameHulk));     // one way call all the arrays 
		System.out.println(Arrays.deepToString(NameHulk));  // Another way 
		
		
		
		

		// Write an Array for boolean - name it HulkAttendence 
		
		boolean[] StudentAttendence = new boolean[] {true ,false , false, true,true, false, true };
		
		System.out.println("Student attendence: " + StudentAttendence[3]);
		
		System.out.println("Total Student : " + StudentAttendence.length);
		
		
		// Multi-Dimentional Array
		
		int [][] AgeHulkStudents2D = {{22,23,25,27,29}, {30,31,32,45,50}};
		
		System.out.println("Student Age 2D : " + AgeHulkStudents2D[1][2]);
		
		
        //int [][] AgeHulkStudents3D = {{22,23,25,27,29}, {30,31,32,45,50},{40,42,44,49}}; // Three-Dimentional Array
		
		//System.out.println("Student Age 3D : " + AgeHulkStudents3D[0][2][1]);
		
	
		
		
		
// Hashmap Store multiple data using key-value pair, Implementation of Map Interface 
		
// Create a HashMap object called people that will store String *keys and Integer *values:
		
	HashMap<String,Integer> StudentAge = new HashMap<String,Integer>();
	
	StudentAge.put("Mohammed", 30);
	
	StudentAge.put("Showrav", 25);
	
	StudentAge.put("Munna", 29);
	
	//StudentAge.clear();  ==> Removes all of the mappings from this map. The map will be empty after this call returns.
	
	
	System.out.println("Print Specfic Student Age : " + StudentAge.get("Showrav"));
	System.out.println("Remove Specfic Student Age : " + StudentAge.remove("Mohammed") ); // remove an item
	System.out.println("Print All the Students name with Age : " + StudentAge);
	

//====================================================================	
	
	
		// Loop Through a HashMap
		// Loop through the items of a HashMap with a for-each loop.
	    // Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
	
	for (String i : StudentAge.keySet()) {     // Print keys
		System.out.println(i);
	} 
	
	for (Integer i : StudentAge.values()) {   // Print Values
		System.out.println(i);
	}
	
   for(String i: StudentAge.keySet()) {
	   System.out.println("Keys Is : " + i +"," + " Values Is : " + StudentAge.get(i)); // Print keys and values
   }
   
   
   
 //=================================================================================
	 // HashTable Store multiple data using key-value pair, No Duplicate,
	 // Also is Synchronized(only one thread can be modified) 
	 
   Hashtable< String, String> Continent = new Hashtable<String,String>();
	 Continent.put("Bangladesh", "Asia");
	 Continent.put("USA","North America");
	 Continent.put("England", "Europe");
	 
	 System.out.println("HashTable Continent : " + Continent.get("Bangladesh"));
	 System.out.println(Continent);
   
 //=================================================================================
	 
	 // HashSet Store Unordered Collection Containing unique value, Implementation of Set Interface
	 
	 HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	 
	}
		
	}



