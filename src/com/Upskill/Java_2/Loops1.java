package com.Upskill.Java_2;

public class Loops1 {

	public static void main(String[] args) {
		//PracticeForLoop();
		//PracticeWhileLoop();
		//PracticeDoWhileLoop();
		//PracticInfiniteLoop();
		practiceNestedForLoop();

	}
	
	public static void PracticeForLoop() {     // For Loop - Do again and again up to Upper limit
		int i;                                 // Initialize the variable
		for(i = 1; i <= 10; i++) {          // Setting lower limit, Upper limit, Increment or Decrement 
		
		System.out.println("For Loop Number" +i);                 // // Statement
		}	                                
  }
	
	public static void PracticeWhileLoop() {             // While Loop - Do again and again up to Upper limit
		int i =1;                                         // Initialize the variable
		while(i <= 10) {                                   // Setting condition
			 
		System.out.println("While Loops number = " + i);   // Statement
		i++;                                               //Increment or Decrement
	}                                         
  }
	public static void PracticeDoWhileLoop() {
		int i =1;
		do {
			System.out.println("Do while Number =" +i);    // Statement
			i++;                                            //Increment or Decrement
		}while (i<=10);                                     // Checking Condition
	}                                                       

public static void PracticInfiniteLoop() {     // Infinite Loop- Never ending
	int i ;                                    // Initialize the variable
 	for(i = 1; ; i+=2) {                        // Setting No Upper limit
	System.out.println("For Loop Number" +i);  // Statement
	}	        
  }

public static void practiceNestedForLoop() {        // Nested Loop - loop inside another loop. 
	int i;                                          // Initialize i for loop 1
	int j;                                          // Initialize j for loop 2
	for(i=1; i<=10; ++i ) {                         // First loop for i    
		
		for(j=1; j<=10; ++j ) {                     // Second loop for j
			
			int multipationTable = i * j;           // Statement for loop 2
			
			System.out.print (multipationTable + " " );
		}
		System.out.println(" ");
   }
  }
}

