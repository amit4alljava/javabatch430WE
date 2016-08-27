abstract class Loan
{
	int accountNo;
	double balance;
	Loan(){
		
	}
	abstract double roi();
	void applyForLoan(){
		System.out.println("Apply For Loan");
	}
}
class HomeLoan extends Loan
{
	@Override
	double roi(){
		System.out.println("Home Loan ROI is 9%");
		return 9.0;
	}
}
class AutoLoan extends Loan
{
	@Override
	double roi(){
		System.out.println("Autoi Loan ROI is 11.5%");
		return 11.5;
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loan fiveYear = new Loan();
		HomeLoan tenYear = new HomeLoan();

	}

}
