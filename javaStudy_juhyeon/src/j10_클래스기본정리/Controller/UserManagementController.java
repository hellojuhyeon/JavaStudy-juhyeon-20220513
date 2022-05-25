package j10_클래스기본정리.Controller;

import j10_클래스기본정리.Repository.User;
import j10_클래스기본정리.Service.UserService;

public class UserManagementController {
	private UserService userService;
	
	public UserManagementController(UserService userService) {
		userService = new UserService();
	}

	public void createUser() {
		User user = userService.insertUser();               //유저객체만 입력가능
		
		System.out.println("[새로 추가된 사용자]");
		System.out.println(user.toString());
	}
	
	public void getUser() {
		
		
	}
	public void updateUser() {
		
	}
	
	public void deleteUser() {
		
	}
	
	
	
}
