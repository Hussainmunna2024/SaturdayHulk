package com.Upskill.Assignment_2;

public class Assignment_2_2_2 {
	
	/* 2.  A school conducts a 100 mark exam for its student and grades them as follows:
 	Grade:
 		Grade A: Marks>=90
 		Grade B: Marks>=80-89
 		Grade C: Marks>=70-79
 		Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60

     Write a java program to calculate the grade for a student in a method passing 
     parameter for grade to display every grade type, using if..else statement.   */
	
	public static void main(String[]args) {
		Studentgrade(95);
		Studentgrade(85);
		Studentgrade(75);
		Studentgrade(65);
		Studentgrade(55);
		
	}
	
    public static void Studentgrade(int Marks) {
    
		
		if(Marks >= 90 ) {
		System.out.println("Student grade is A ");
		
		}
		
		else if(Marks > 80 && Marks < 89 ) {
			System.out.println("Student grade is B ");
			
		}
		
		else if(Marks >= 70 && Marks <= 79 ) {
			System.out.println("Student grade is C ");
			
		}
		
		else if(Marks >= 60 && Marks <= 69 ) {
			System.out.println("Student grade is D ");
			
		}else {
			System.out.println("Student Fail");
			
    	
      }
    }
  }
