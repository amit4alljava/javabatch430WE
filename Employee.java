// Object Oriented Programming
// OOAD = Object Oriented Analysis and Designing
// S O  L  I D
// SRP - Single responsiblity Principal
// OOP Principal
// 1. Encapsulation = Binding Member Variable + Member Methods
// into Single Unit , and that Unit is called Class
// Gud Encapsulation = private Member Variable + public Member Methods

public class Employee {
private int id;  // Member Variable Must be Private (Secure)
private String name;
private double salary;
private final double EL=1.5;
public void takeInput(int id , String name, double salary){
	if(id<=0){
		System.out.println("Invalid Id ");
		System.exit(0);
	}
	this.id =id;  //setting local var into member var
	this.name = name;
	this.salary = salary;
}
public void print(){
	System.out.println("Id "+this.id);
	System.out.println("Name "+this.name);
	System.out.println("Salary "+this.salary);
}
}
