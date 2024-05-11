package com.Upskill.Java_2;

public class SwitchCase2 {
	   public static  String getMonthName(int month) {
	        String monthName;
	        switch (month) {
	            case 1:
	                monthName = "January";
	                break;
	            case 2:
	                monthName = "February";
	                break;
	            case 3:
	                monthName = "March";
	                break;
	            case 4:
	               monthName = "April";
	                break;
	            case 5:
	                monthName = "May";
	                break;
	            case 6:
	                monthName = "June";
	                break;
	            case 7:
	                monthName = "July";
	                break;
	            case 8:
	                monthName = "August";
	                break;
	            case 9:
	                monthName = "September";
	                break;
	            case 10:
	                monthName = "October";
	                break;
	            case 11:
	                monthName = "November";
	                break;
	            case 12:
	                monthName = "December";
	                break;
	            default:
	                monthName = "Invalid month";
	                break;
	        }
	        return monthName;
	    }

	    public static void main(String[] args) {
	        int month = 5;
	        String monthName = getMonthName(month);
	        System.out.println("The month name for month number " + month + " is: " + monthName);
	    }
	}

	


