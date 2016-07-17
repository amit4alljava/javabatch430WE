// Logic to Test Employee
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ram = new Employee();
		ram.print();
		// ram is a reference variable 
		// it store the reference (Address)
		System.out.println("After Set the Values");
		ram.takeInput(-1001, "Ram", -9999);
//		ram.id = -1001; //5555.id = 1001
//		ram.name="Ram";
//		ram.salary=-9999;
		ram.print();
//		System.out.println("Id "+ram.id);
//		System.out.println("Name "+ram.name);
//		System.out.println("Salary "+ram.salary);
		
		Employee shyam =new Employee();
		shyam.print();
		
		Employee ram2 = ram;
		ram2.takeInput(1002, "Ram Kumar", 7777);
		
		//ram2.id = 10000;
		System.out.println("******************************** RAM2");
		ram2.print();
		ram.print();
//		System.out.println("Id "+ram2.id);
//		System.out.println("Name "+ram2.name);
//		System.out.println("Salary "+ram2.salary);
		
	}

}
