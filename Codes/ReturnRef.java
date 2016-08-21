import java.util.Scanner;

// Design Related to Login
class LoginView
{
	public void doLogin(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserid(userid);
		loginDTO.setPassword(password);
		LoginDAO loginDAO =new LoginDAO();
		DashBoardDTO dashBoard = loginDAO.checkLogin(loginDTO);
		if(dashBoard==null){
			System.out.println("Invalid Userid or Password !");
			return ;
		}
		String friends [] = dashBoard.getFriends();
		System.out.println("Your Friends are ");
		for(String friend : friends){
			System.out.println(friend);
		}
		System.out.println("Games are ");
		for(String game : dashBoard.getGames()){
			System.out.println(game);
		}
		System.out.println("Post are ");
		for(String post : dashBoard.getPost()){
			System.out.println(post);
		}
	}
}
// Code Related to DB Connectivity
class LoginDAO
{
	public DashBoardDTO checkLogin(LoginDTO loginDTO){
		DashBoardDTO dto = null;
		if(loginDTO.getUserid().equals("amit") 
				&& loginDTO.getPassword().equals("123")){
			dto = new DashBoardDTO();
			String friends[] ={"ram","shyam"};
			dto.setFriends(friends);
			dto.setGames(new String[]{"Candy Crush","Temple Run"});
			dto.setPost(new String[]{"Hello ","Hi"});
			
		}
		if(loginDTO.getUserid().equals("ram") 
				&& loginDTO.getPassword().equals("222")){
			dto = new DashBoardDTO();
			String friends[] ={"mike","tom"};
			dto.setFriends(friends);
			dto.setGames(new String[]{"Candy Crush","Angry Bird"});
			dto.setPost(new String[]{"Buy New Car ","Hi"});
			
		}
		
		return dto;
	}
}
class LoginDTO{
	private String userid;
	private String password;
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
class DashBoardDTO{
	private String post[] = new String[10];
	private String friends[]= new String[5];
	private String games[] = new String[3];
	public String[] getPost() {
		return post;
	}
	public void setPost(String[] post) {
		this.post = post;
	}
	public String[] getFriends() {
		return friends;
	}
	public void setFriends(String[] friends) {
		this.friends = friends;
	}
	public String[] getGames() {
		return games;
	}
	public void setGames(String[] games) {
		this.games = games;
	}
	
}
public class ReturnRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginView view = new LoginView();
		view.doLogin();

	}

}
