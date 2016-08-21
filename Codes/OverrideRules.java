// Rule -1 Weaker Access Rule
// Rule-2 CoVariant Return Type (Java 1.5)
/*
 * No Global Variables in Java
 * Access
 * 1. private - With in the class
 * 2. default is no keyword for access - Access with in the Package (Folder)
 * 3. protected - With in the Package and outside the package by using Inheritance
 * 4. public - Can Access Outside and Inside Both
 */
class A
{
	private int x;
	int y;
	void print(){	
	System.out.println("A Print Call");
}
}
class B extends A
{
	@Override
	public void print(){
		System.out.println("B Print Call");
	}
}
public class OverrideRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
