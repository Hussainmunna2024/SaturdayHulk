package com.Upskill.Java_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.HashSet;

public class Array_Hashmap_Hashset_HashTable_1 {
	
	public static void main(String[]args) {
		
		//Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

		
		
		// Array Store multiple data using index (integer Value)
		//⬇ int Start From Here
		 // Write an Array for Student age NameHulk (integer - data type)
		
		int age = 28;                                   // variable 
		
		//To declare an array, define the variable type with square brackets:
		
		int[] Studentage = new int[] {22,26,27,28,31};   // Array
		
		// Array index                [0][1][2][3][4]
		
		System.out.println("Baruch College Student age: " + Studentage[2]);
		
		System.out.println("Baruch College Toatal Student : " + Studentage.length); // To find out how many elements an array has, use the length property:

	//=========================================================================================================================================================	
		
		//⬇ String Start From Here
		
		// Write an Array for Student name StudentName (String data type)
		
		String[] StudentName = new String[] {"Mohammed", "Showrav", "Munna", "Abu", "Rabbi"};
		
		System.out.println("Baruch College Student Name is: " + StudentName[1]);
		
		System.out.println("Baruch College Toatal Student is " + StudentName.length);
		
		System.out.println(Arrays.deepToString(StudentName)); // To Count the whole Array use (Arrays.deepToString(StudentName));

		System.out.println(Arrays. toString(StudentName)); // or Arrays.toString
		
		 // To create an array of String, you could write:
		String[] CarName = {"Nissan", "BMW", "RangrRover", "Aude", "Tesla", "Mazda"};
		System.out.println(" My Favorite Car is : " + CarName[2]);
		
		//=========================================================================================================================================================	
		//⬇ boolean Start From Here
				
		// Write an Array for boolean - name it StudentAttendence (boolean data type)
		
		boolean[] StudentAttendence = new boolean[] {true ,false , false, true,true, false, true };
		
		System.out.println("Baruch College Student attendence: " + StudentAttendence[3]);
		
		System.out.println("Baruch College total Student attendence: " + StudentAttendence.length);
		
		System.out.println(Arrays.toString(StudentAttendence));
		
		//=========================================================================================================================================================	
				//⬇ Change an Array Element Start From Here

			String[] CarBrandName= {"Nissan", "BMW", "RangrRover", "Aude", "Tesla", "Mazda"};
			CarBrandName[2] = "Toyota";
			System.out.println("Change the Car brand Name : " + CarBrandName[2]);
				
			String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
			cars[0] = "Opel";
			System.out.println("Change the car Name :" + cars[0]);
			    
//=========================================================================================================================================================	
       //⬇ 	//🫴 Java Multi-Dimensional Arrays Start from here.    
			
	/* 👉A multidimensional array is an array of arrays.

     👉 Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.

     👉 To create a two-dimensional array, add each array within its own set of curly braces: 👁️*/
			int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
			System.out.println(myNumbers[1][2]); // Outputs 7
			
	        //Change Element Values
			int[][] number = { {1, 2, 3, 4}, {5, 6, 7} };
			number[1][2] = 9;
			System.out.println(number[1][2]); // Outputs 9 instead of 7
			    
		//Loop Through a Multi-Dimensional Array
			int[][] mynumber = new int[][]{{1,2,3,4},{5,6,7,8}};
			 for(int i=0;  i < mynumber.length; i++) {
				 for(int j=0;  j < mynumber[i].length; j++) {
					 System.out.println("Print All The Numbers :" + mynumber[i][j]);
					 
	
			
	           }    
			 }
			 //========================================================================================================
			// 👁👁HashMap Store multiple data using key-value pair, Implementation of Map Interface
			 
			 // Add Items: The HashMap class has many useful methods. For example, to add items to it, use the put() method:
			 // Access an Item: To access a value in the HashMap, use the get() method and refer to its key:
			 //HashMap Size: To find out how many items there are, use the size() method:
			 //Remove an Item: To remove an item, use the remove() method and refer to the key:
			 // To remove all items, use the clear() method:

				HashMap<String,String> CapitalCities = new HashMap<String,String>(); 
				CapitalCities.put("Bangladesh","Dhaka");
				CapitalCities.put("USA", "Washington DC");
				CapitalCities.put("England","London");
		        //CapitalCities.clear();
				
				System.out.println("Print All the Country Name With Cities : " +CapitalCities.size());
				System.out.println("Print All the Country Name With Cities : " +CapitalCities.remove("England"));
				System.out.println("Print All the Country Name With Cities : " + CapitalCities); 
				System.out.println("Print All the Country Name With Cities : " + CapitalCities.get("Bangladesh"));
				
				//====================================================================	
				
				
				// Loop Through a HashMap
				// Loop through the items of a HashMap with a for-each loop.
			    // Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
			
			for (String i : CapitalCities.keySet()) {     // Print keys
				System.out.println(i);
			} 
			
			 for (String i : CapitalCities.values()) {  // // Print values
			      System.out.println(i);
			 }
			    
			// Print keys and values
			 for (String i : CapitalCities.keySet()) {
			   System.out.println("key: " + i + ","+" value: " + CapitalCities.get(i));
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
			 // Java HashSet
			 // A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
			 // Create a HashSet object called cars that will store strings:
			 HashSet<String> Cars = new HashSet<String>();
			 //Add Items:The HashSet class has many useful methods. For example, to add items to it, use the add() method:
			    Cars.add("Range Rover");
			    Cars.add("BMW");
			    Cars.add("Audi");
			    Cars.add("BMWS");
			    Cars.add("Mazda");
			    Cars.remove("BMWS"); // Remove an Item: To remove an item, use the remove() method:
			    // Cars.clear(); // To remove all items, use the clear() method:
			    System.out.println(Cars);
			    //Check If an Item Exists: To check whether an item exists in a HashSet, use the contains() method:
			    System.out.println(Cars.contains("Nissan"));
			    System.out.println(Cars.size()); // HashSet Size: To find out how many items there are, use the size method:
			 
	       }
         }
	     
	
        
      
   