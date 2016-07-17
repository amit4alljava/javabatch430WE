// Testing the Student class
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram ;  // Declare
		ram =new Student(); // Initialize
		ram.takeInput(-1001, "Ram", "BCA", -90);
//		ram.rollno = -1001;
//		ram.name = "Daud";
//		ram.course = "BCA";
//		ram.marks=-90;
		ram.print(); //2222.print()
		// Let ram reference is 2222
		// new Student ()will allocate a memory and 
		// give the reference (address) to ram
		// ram is a reference variable
		// new is same like malloc in C
		// 2222.rollno
//		System.out.println("Rollno "+ram.rollno);
//		System.out.println("Name "+ram.name);
//		System.out.println("Course "+ram.course);
//		System.out.println("Marks "+ram.marks);
		//Student shyam = ram; 
		System.out.println("*********************************");
		Student shyam = new Student();
		shyam.rollno = 1002;
		
		shyam.print();
//		System.out.println("Rollno "+shyam.rollno);
//		System.out.println("Name "+shyam.name);
//		System.out.println("Course "+shyam.course);
//		System.out.println("Marks "+shyam.marks);
		
		
//		System.out.println("Ram is "+ram.toString()+" "+ram.hashCode());
//		System.out.println("Shyam is "+shyam+" "+shyam.hashCode());
//		
//		if(ram == shyam){
//			System.out.println("Same Ref");
//		}
//		else
//		{
//			System.out.println("Not Same Ref");
//		}
//		
		
 		int x;  // Declare
		x = 100; // Initalize

	}

}
