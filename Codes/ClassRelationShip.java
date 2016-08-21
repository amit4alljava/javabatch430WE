/*
 * Every class has default constructor by default 
 * if u create any constructor in a class , then default is kill 
 * automatically, Child class by default call the default constructor
 * of the parent class
 * 
 */
// final with class , u can't Inherit the final class
//final class Account
class Account
{
	// variable with final (means constant)
	final String BANK_CODE = "SBI";
	int accountNo;
	double balance;
	String name;
	
	Account(){
		balance = 10000;
		System.out.println("Account Class Default Cons Call");
	}
	Account(double balance){
		this.balance = balance;
		System.out.println("Account Clas Param Cons Call");
	}
	void deposit(double amount){
		System.out.println("Ur Amount is Deposit in a Bank..."+amount);
		balance = balance + amount;
	}
	// final with method - Prevent Overriding
	final void showBalance(){
		System.out.println("Account No is "+accountNo);
		System.out.println("Your Balance is "+balance);
	}
	
}
// IS-A Code Reuse
// SavingAccount is a Account
class SavingAccount extends Account
{
	// In Overriding signature must be same (Before Java 5)
	// method signature = return type + method name + arguments
	@Override // (optional, But Good Practice)
	void deposit(double amount){
		super.deposit(amount); // Call the Parent First
		if(balance>=50000){
			System.out.println("First Show Your Pan Card...");
		}
		else{
		System.out.println("Ur Amount is Deposit in a Bank..."+amount);
		balance = balance + amount;
		}
		}
	double roi=4.2/100;
	SavingAccount(){
		//super(9999);
		// super() will call parent class default constructor
		//super(); // implicit super by default
		//balance = 12000;
		System.out.println("Saving Account Default Cons Call");
	}
//	void showBalance(){
//		System.out.println("Account No is "+accountNo);
//		System.out.println("Your Balance is "+balance);
//	}
	void recRoi(){
		double roi = balance * this.roi;
		balance = balance + roi;
		System.out.println("Your ROI With Balance "+balance);
	}
}
class CurrentAccount extends Account
{
	double roi=5.0;
	void recRoi(){
		double roi = balance * this.roi;
		balance = balance - roi;
		System.out.println("Your ROI With Balance "+balance);
	}
}
// IS-A
// Has-A
class ITStudent
{
// Has - a ITStudent Has a Course
	Course course = new Course();
}
class Course
{
	
}
public class ClassRelationShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// When u call child class any constructor it will
		// call parent class default constructor by default
		SavingAccount sa = new SavingAccount();
		sa.showBalance();
		sa.recRoi();
	}

}
