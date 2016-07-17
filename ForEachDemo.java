import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ForEach Is not a Loop , it is a function in Java 8
		// enhance for loop it is a loop and it is comes in Java 5
		int d[] = {10,20,30,40,50,7,11,66,13};
		//List list = Arrays.asList(d);
		ArrayList<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1);
		list.add(3);
		list.forEach((x)->{
		if(x%2==0){
		System.out.println("Even" +x);
		}
		else
		{
			System.out.println("Odd "+x);
		}
		});
		// int d[] is not class for us
		// ArrayList is like an [] for us
		// and it is kind of Dynamic 
		// Java 8 I Introduce a New function , that is forEach
		// Java OOP
		// function must be define inside a class
		// everything is start from class
		
//		for(int e : d)
//		{				
//			if(e%2==0){
//				System.out.println("This is Even "+e);
//			}
//			else{
//				System.out.println("this is Odd "+e);
//			}
//			//System.out.println(e);
//		}

	}

}
