import java.util.Scanner;

// Data Transfer object (DTO)
class RegDTO{
	private String userid;
	private String password;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
// RegDAO (It is a class for doing the DB Operations)
class RegDAO{
	//3333
	void registerAndStoreInDB(RegDTO dto){
	//void registerAndStoreInDB(String userid, String password){
		System.out.println("Connection Open");
		System.out.println("Store Data in DB "+dto.getUserid()+" "+dto.getPassword()+" "+dto.getEmail());
		//System.out.println("Store Data in DB "+userid+" "+password);
		System.out.println("Connection Close");
	}
}
// this is the class for doing the GUI things
class RegView
{
	void doRegister(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String pwd= scanner.next();
		System.out.println("Enter the Email");
		String email = scanner.next();
		scanner.close();
		// Has-a 
		RegDAO dao = new RegDAO();
		RegDTO dto = new RegDTO();
		dto.setUserid(userid);
		dto.setPassword(pwd);
		dto.setEmail(email);
		//dao.registerAndStoreInDB(userid, pwd);
		dao.registerAndStoreInDB(dto); //33333
	}
}

public class ObjectPassAndObjectReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegView regView = new RegView();
		regView.doRegister();

	}

}
