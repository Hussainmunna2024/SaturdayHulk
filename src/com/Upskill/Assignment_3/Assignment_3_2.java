package com.Upskill.Assignment_3;

public class Assignment_3_2 {
	
/* 2.Write a java program which will display 5 employee information(name, age, salary and address).*/




//static int count =1;

public Assignment_3_2(String name, int age, double salary, String address) {
	 System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Salary: " + salary);
     System.out.println("Address: " + address);
     //count++;
     System.out.println();
	}

public static void main(String[] args) {
		
Assignment_3_2[] employees = new Assignment_3_2[5];


employees[0] = new Assignment_3_2("Muazzem Hussain", 25, 170000.0, "123 Lafayette Street, Brooklyn, NY,USA");
employees[1] = new Assignment_3_2("Abu Showrav", 24, 120000.0, "1560 UnionPort Road, Bronx, NY, USA");
employees[2] = new Assignment_3_2("Mamun Ahmed", 35, 90000.0, "76 St, Queens,NY, USA");
employees[3] = new Assignment_3_2("Ahyeon Lee", 31, 75000.0, "321 Pine Ave,Queens, NY, USA");
employees[4] = new Assignment_3_2("Young Norman", 65, 40000.0, "654 Thomas Boyland, Brooklyn, NY, USA");

	      
	}

}
