// Overloading - Same Method Name but arguments are different
// arguments - Number of Arguments can be change
// type of arguments can be change
// Overloading is not dependent on Inheritance
class Calc{
	// ... is called var-args (Java 1.5)
	public int add(int ...x){
		int sum = 0;
		for(int i : x){
			sum = sum + i;
		}
		return sum;
	}
//	public int add(int x, int y){
//		return x + y;
//	}
//	public int add(int x, int y,int z){
//		return x + y + z;
//	}
//	public double add(double x, double y){
//		return x + y;
//	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		System.out.println(calc.add());
		System.out.println(calc.add(1,2));
		System.out.println(calc.add(1,2,3));
		System.out.println(calc.add(1,2,3,4,5,6,7,8,9,10));
		
	}

}
