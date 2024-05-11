package com.Upskill.Assignment_3;

public class Assignment_3_3 {
	
/* 3.Bank is a class that provides functionality to get interest rate. 
 * Display different interest rate using rate functionality for Chase, City and TD banks followed by 8%, 7% and 9%. 
 * Hints: using method override.

*/

	  public double getInterestRate() {
	        return 0.0;
	    }
	}

	class ChaseBank extends Assignment_3_3 {
	    @Override
	    public double getInterestRate() {
	        return 8.0;
	    }
	}

	class CityBank extends Assignment_3_3 {
	    @Override
	    public double getInterestRate() {
	        return 7.0;
	    }
	}

	class TDBank extends Assignment_3_3 {
	    @Override
	    public double getInterestRate() {
	        return 9.0;
	    }
	

	
	    public static void main(String[] args) {
	    	Assignment_3_3 bank1 = new ChaseBank();
	    	Assignment_3_3 bank2 = new CityBank();
	    	Assignment_3_3 bank3 = new TDBank();

	        System.out.println("Chase Bank Interest Rate: " + bank1.getInterestRate() + "%");
	        System.out.println("City Bank Interest Rate: " + bank2.getInterestRate() + "%");
	        System.out.println("TD Bank Interest Rate: " + bank3.getInterestRate() + "%");
	    }
	}

