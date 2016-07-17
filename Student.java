// Class contains Functionality
// SRP 
public class Student { //extends Object {
	// Member of Student Class
	 int rollno;  // Features of Student
	
	private String name;
	private String course;
	private int marks;
	
	// Local Variable of takeInput
	public void takeInput(int rollno, String name, String course , int marks){
		// Member Variable Initialize by Local Variable
		if(rollno<=0){
			System.out.println("Invalid Rollno ");
			System.exit(0);
		}
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	
	public void print(){
		//this - it is a keyword and it hold the current object reference 
		System.out.println("ID "+this.rollno);
		System.out.println("Name "+this.name);
		System.out.println("Course "+this.course);
		System.out.println("Marks "+this.marks);
	}
//	public int hashCode(){
//		return 100;
//	}
}
