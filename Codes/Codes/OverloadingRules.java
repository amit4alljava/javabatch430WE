import java.util.LinkedList;
// It start from  int
// if int is not there 
// 1. Looking for Wideing
// 2. Looking for Same Wrapper Class
// 3. Looking for Var-args
// 4. Explicit Type Casting
class TypePromotion{
//	long show(long x){
//		System.out.println("long");
//		return 0;
//	}
//	byte show(float x){
//		System.out.println("float");
//		return 0;
//	}
//	byte show(Integer x){
//		System.out.println("Integer");
//		return 0;
//	}
	byte show(Long x){
		System.out.println("Long");
		return 0;
	}
//	byte show(int ...x){
//		System.out.println("int ...");
//		return 0;
//	}
	byte show(short x){
		System.out.println("short");
		return 0;
	}
	byte show(byte x){
		System.out.println("byte");
		return 0;
	}
//	int show(int x){
//		System.out.println("int");
//		return 0;
//	}
}
public class OverloadingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Wideing and Narrow Concept in Primitive Data Types
		int a = 100;
		long b = a;  // Implicit Type casting (Wideing)
		a = (int)b;// Explicit Type Casting (Narrow)
		
		// 2. Wrapper Classes
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1000);
		l.add(2000);
		//l.add(new Integer(1000));  //Boxing
		//l.add(new Integer(2000));
		System.out.println("Values are "+l);
		Integer x = new Integer(128); //Boxing
		//Integer x = 128; // x has a reference of 1000 
		int y = 1000;  // y has a value of 1000
		int m = 1000;
		Integer z = 128;
		if(y==m){
			System.out.println("Value Same");
		}
		
		if(x == z){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		if(x.intValue() == z.intValue()){
			System.out.println("Value are same");
		}
		else
		{
			System.out.println("Not Same");
		}
		// Var - Args int...
		System.out.println("************************");
		TypePromotion tp = new TypePromotion();
		//tp.show(1);
	tp.show((byte)1);
	}

}
