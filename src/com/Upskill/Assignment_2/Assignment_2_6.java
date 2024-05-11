package com.Upskill.Assignment_2;
//6.  Write a java program to find the prime number from 1 to 100 and print them.

public class Assignment_2_6 {
	public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");
        
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;

 }
}
