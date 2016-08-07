// Class is a collection of similar objects
// Class is Noun
// Class scope either public or default
// folder = package
// if u want to access the class outside the package
// then it must be public
// if u not specify the public it is become the default
// default is access with in the package
// Class contains Member Variables + Member Methods
// 1. Encapsulation -  
//Data Binding (Member Variables + Member Methods)
// Example - Class is a Example of Encapsulation
// Good Encapsulation = private Member Variables + public member methods
public class Student {
	// Instance Variables 
	// This will create when u create an Object
	// Per Instance Variables = Per Object
	// Data Hiding - 
	private String collegeName;
	private int rollno; // Member Variables
	private String name;
	private String course; // Now Access with in the class
	/*
	 * Constructor will call when u create the object
	 * Constructor name is same as class name
	 * every class by default , default constructor
	 * default constructor is no args constructor
	 * by default constructor is empty do nothing
	 * constructor is used to initialize 
	 * the instance variables
	 * In your class u can have multiple constructors
	 * Constructor return nothing
	 */
	Student(){
		System.out.println("Student Class Default Cons Call");
		collegeName = "SRCC";
		//	rollno = 10;
//	name = "Ram";
//	course = "MCA";
	}
	Student(int rollno, String name){
		this();
		this.rollno = rollno;
		this.name = name;
	}
	
	// Constructor Overloading
	// Parameterized Constructor
	Student(int rollno , String name , String course){
		this(rollno,name); 
		//this();// Calling same class default constructor
		//Student();
		System.out.println("Param Cons Call");
		//this.rollno= rollno + collegeName.length();
		//this.name = name;
		this.course = course;
		//this();
	}
	// Local Variables
	// Verb
	// SRP
	public void takeInput(int rollno, String name, String course){
		// When Local Variable and Instance Variable name is same
		if(rollno>0){
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		}
		else
		{
			System.out.println("Invalid Rollno ");
			System.exit(0);
		}
	}
	public void print(){
	System.out.println("Rollno "+rollno);
	System.out.println("Name "+name);
	System.out.println("Course "+course);
	System.out.println("CollegeName "+collegeName);
	}
	
	

}
