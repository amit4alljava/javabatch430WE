
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student ram = new Student();
		Student ram = new Student(1001,"Ram","MCA");
		//ram.takeInput(1001, "Ram", "MCA");
		ram.print();
		System.out.println("***************************");
		Student shyam = new Student(1002,"Shyam","BCA");
		shyam.print();
		// new Student() is Instance (Object) Creation
		//ram.rollno = -1001;
	}

}
