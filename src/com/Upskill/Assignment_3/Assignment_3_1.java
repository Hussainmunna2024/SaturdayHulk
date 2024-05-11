package com.Upskill.Assignment_3;

public class Assignment_3_1 {
	
	/* 1.Write a class name BankAccount which has savings and checking class. 
	 * BankAccount class that has a name and an initial amount, which are both set in the constructor. 
	 * Also, it lets users make deposits. Note that the account name must be set when an account is created.
	 * Demonstrates the account class hierarchy with output of:


	a.Account name: savings

	b.Initial amount: 10000

	c.New amount after deposit: 15000

	d.Account name: checking

	e.Initial amount: 20000

	f.New amount after deposit: 26000

	g.New amount after withdrawal: 2300 */
	

	    private String name;
	    private double balance;

	    public Assignment_3_1(String name, double initialAmount) {
	        this.name = name;
	        this.balance = initialAmount;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("New amount after deposit: " + balance);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("New amount after withdrawal: " + balance);
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    public String getName() {
	        return name;
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

	class SavingsAccount extends Assignment_3_1 {
	    public SavingsAccount(String name, double initialAmount) {
	        super(name, initialAmount);
	    }
	}

	class CheckingAccount extends Assignment_3_1 {
	    public CheckingAccount(String name, double initialAmount) {
	        super(name, initialAmount);
	    }
	

	
	    public static void main(String[] args) {
	        // Create savings account
	        SavingsAccount savings = new SavingsAccount("savings", 10000);
	        System.out.println("Account name: " + savings.getName());
	        System.out.println("Initial amount: " + savings.getBalance());
	        savings.deposit(5000);

	        // Create checking account
	        CheckingAccount checking = new CheckingAccount("checking", 20000);
	        System.out.println("\nAccount name: " + checking.getName());
	        System.out.println("Initial amount: " + checking.getBalance());
	        checking.deposit(6000);
	        checking.withdraw(23000);
	    }
	
}