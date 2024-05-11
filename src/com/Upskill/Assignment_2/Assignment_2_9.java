package com.Upskill.Assignment_2;

/*9. Write a program to swap two string variables (Talen, Tech) and display result on the 
screen. */

public class Assignment_2_9 {
	
	public static void main(String[] args) {
		
		
		String str1 = "Talen";
        String str2 = "Tech";
        
        System.out.println("Before swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        
        // Swapping the strings
        String temp = str1;
        str1 = str2;
        str2 = temp;
        
        System.out.println("After swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
		
	}


