package com.Upskill.Java_1;

public class MethodType extends Variables{
	
	/* Types of Methods
	 
	  1. Void  Method 
	  2. Static Method 
	  3. Return Type Method
	  4. Snipe of Code is Method is like piece of code. 
	  
	 */
	public static int hourlyincome = 70; 
	
	public static void main(String[] args) {
		  MethodType salary = new MethodType();
		  salary.annualIncomeVoid();
		  
		  System.out.println("Monthly income =" + salary.monthlyIncomeReturn());
		  weeklyincomeStatic();
		  System.out.println("Company name is =" + salary.Companynamereturn());
		  System.out.println("Weekly income is: " +salary.weeklyIncomeStatic1());
		 
	        
	    }
		
	
	public void annualIncomeVoid() {
		int calculationAnnualIncome = hourlyincome * 2000;
		System.out.println("My Annual Income = " + calculationAnnualIncome);
	}
	
	
	public int  monthlyIncomeReturn() {
		int calculateMonthlyIncome = hourlyincome * 180;
		return calculateMonthlyIncome;
	}


	public static void weeklyincomeStatic() {
		int calculateMonthlyIncome = hourlyincome * 40;
		System.out.println("Weekly income is" + calculateMonthlyIncome);
	}
	public String Companynamereturn() {
		String Companyname = "Canton";
		return Companyname;
}
	
	public static boolean weeklyIncomeStatic1() {
	    int hourlyIncome = 70; 
	    int calculateWeeklyIncome = hourlyIncome * 40; 
	    System.out.println("Weekly income is: " + calculateWeeklyIncome);
	    
	   return true; 
	}
}
