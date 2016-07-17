
public class BreakAndContinue {

	public static void main(String[] args) {
		// Labeled Loop in Java
		
		myloop:
		for(int i = 1 ; i<=3; i++){
			for(int j= 1; j<=3 ; j++){
				if(i==j){
					break myloop;
					//continue myloop;
					//continue; // Skip the Current  and Increment the Loop
					//break;  // Exit from the Current Loop
				}
				System.out.println("I is "+i+" and J is "+j);
			}
		}

	}

}
