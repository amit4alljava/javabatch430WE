package com.tcs.banking.core.loans;
// what is the scope of a class
// scope can be public or default in case of outer class
// default with in the package and public outside the package
public class HomeLoan {
	
public void applyForLoan(){
	System.out.println("U Have Applied for HomeLoan....");
	Insurance insurance = new Insurance();
	insurance.printInsurance();
}
}
