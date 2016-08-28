abstract interface IPlayer
//interface Player  //100% Abstract
{
	int DEFAULT_SPEED = 10;
	int DEFAULT_POWER = 10;
	int MAX_POWER = 100;
	int DEFAULT_JUMP = 20;
	int MAX_JUMP = 50;
	public static final int MAX_SPEED = 100;
	public abstract int run(); // What to do?
	public abstract int jump();
	int powerIncrement();
	boolean isAlive();
	int attack(int power);
	int defense();
	int X = 20;  //public static final int X = 20;
}
interface IStarPlayer{
	int X = 10;
	public int unlimitedPower();
}
// Multiple Inheritance
interface Hybrid extends IPlayer , IStarPlayer{
	public int getMoreBonusPoints();
}
class RedPlayer implements Hybrid{ //implements IPlayer,IStarPlayer{
	int speed;
	RedPlayer(){
		speed = DEFAULT_SPEED;
	}
	@Override
	public int run(){
		int z = IStarPlayer.X + IPlayer.X;
		if(speed<MAX_SPEED){
			speed++;
		}
		return speed;
	}
	@Override
	public int jump() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int powerIncrement() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int attack(int power) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int defense() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int unlimitedPower() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getMoreBonusPoints() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class BlackPlayer implements IPlayer{
	int speed;
	BlackPlayer(){
		speed = DEFAULT_SPEED;
	}
	public int run(){
		if(speed<MAX_SPEED ){
			speed+=3;
		}
		return speed;
	}
	@Override
	public int jump() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int powerIncrement() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int attack(int power) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int defense() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RedPlayer r = new RedPlayer();
		System.out.println("Run is "+r.run());
	}

}
