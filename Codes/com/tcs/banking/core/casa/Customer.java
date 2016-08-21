package com.tcs.banking.core.casa;

import com.tcs.banking.core.loans.HomeLoan;
import com.tcs.banking.core.loans.Person;

public class Customer extends Person {
	int e ; // Instance Variable
	void printDetails (){
		final int d=999; // Local Variable
		HomeLoan homeLoan = new HomeLoan();
		homeLoan.applyForLoan();
		System.out.println("Name "+name);
		System.out.println("Age "+age);
	}
public static void main(String[] args) {
	
}
}
