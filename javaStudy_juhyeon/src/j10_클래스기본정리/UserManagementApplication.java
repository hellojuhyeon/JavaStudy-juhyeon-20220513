package j10_클래스기본정리;

import j10_클래스기본정리.Controller.UserManagementController;
import j10_클래스기본정리.Service.UserService;

public class UserManagementApplication {

	public static void main(String[] args) {
		UserManagementController userManagementController 
		= new UserManagementController(new UserService());
		userManagementController.createUser();
		

	}

}
