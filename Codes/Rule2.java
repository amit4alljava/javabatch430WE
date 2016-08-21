class AA
{
	int a,b,c,d;
	AA(){
		a=100;
		b = 200;
		c = 300;
		d= 400;
	}
}
class BB extends AA
{
	int e=90;
	int f = 888;
}
class W
{
	AA show(){
		return new AA();
	}
}
class M extends W
{
	@Override
	BB show(){
		return new BB();
	}
}
public class Rule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
