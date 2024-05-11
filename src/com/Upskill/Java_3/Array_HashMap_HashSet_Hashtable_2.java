package com.Upskill.Java_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_HashMap_HashSet_Hashtable_2 {

	public static void main(String[] args) {
		
        int age = 28;                                   // variable 
		
		int[] ageHulk = new int[] {22,26,27,28,31};   // Array
		
		System.out.println(" Student age: " + ageHulk[2]);
		System.out.println(" Total Student age: " + ageHulk.length);
		
		
		
       String[] NameHulk = new String[] {"Mamun Vhai", "Showrav", "Munna", "Abu", "Bashar", "Adon"};
		
		System.out.println(" Student Name is: " + NameHulk[1]);
		
		
		System.out.println(" Toatal Student is " + NameHulk.length);
		
		System.out.println(Arrays.deepToString(NameHulk)); 

		System.out.println(Arrays. toString(NameHulk)); // or Arrays.toString
		
		
		boolean[] StudentAttendence = new boolean[] {true ,false , false, true,true, false, true };
		
		
        int [][] AgeHulk2D = {{22,23,25,27,29}, {30,31,32,45,50}};
		
		System.out.println("Student Age 2D : " + AgeHulk2D[0][3]);
		
		HashMap<String,Integer> Student = new HashMap<String,Integer>();
		Student.put("Mamun Vhai",35);
		Student.put("Showrav", 28);
		Student.put("Munna", 24);
		Student.put("Bashar", 23);
		System.out.println("HashMap Student Age :" + Student.get("Showrav") );
		
		
		HashMap<String, String> Country = new HashMap<String,String>();
		
		Country.put("Bangladesh", "Dhaka");
		Country.put("USA", "Washington DC");
		Country.put("England", "London");
        System.out.println("Remve Country :" + Country.remove("England"));
		System.out.println("Country");
		
		Hashtable< String, String> Continent = new Hashtable<String,String>();
		 Continent.put("Bangladesh", "Asia");
		 Continent.put("USA","North America");
		 Continent.put("England", "Europe");
		 Continent.put("Bangladesh", "Asia");
		 
		 System.out.println("Country Continent :" + Continent.get("India"));
		 System.out.println("Country Continent :" + Continent.get("Bangladesh"));
		 
		 HashSet<String> cars = new HashSet<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("BMW");
		    cars.add("Mazda");
		    System.out.println(cars);
	}

}
