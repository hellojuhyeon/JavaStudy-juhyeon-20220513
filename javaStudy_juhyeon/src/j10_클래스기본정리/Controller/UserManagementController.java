package j10_클래스기본정리.Controller;

import j10_클래스기본정리.Repository.User;
import j10_클래스기본정리.Service.UserService;

public class UserManagementController {
	private UserService userService;
	private User[] users;
	
	public UserManagementController(UserService userService) {
		userService = new UserService();
		users = new User[2];
	}

	public void createUser() {
		int indexResult = findEmptyInUsers();//유저객체만 입력가능
		if(indexResult != -1) {
			users[0] = userService.insertUser();
			
			
			System.out.println("[새로 추가된 사용자]");
			System.out.println(users[indexResult].toString());
			
		} else {
			System.out.println("더이상 사용자를 추가할 수 없습니다.");
		}
		
	
	}
	private int findEmptyInUsers() {
		for(int i = 0; i<users.length; i++) {
			if(users[i]==null) {
				return i;
			}
		}
		return -1;
	}
	public void getUser() {
		
		
	}
	public void updateUser() {
		
	}
	
	public void deleteUser() {
		
	}
	
	
	
}
