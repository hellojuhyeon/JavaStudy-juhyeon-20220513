package j16_인터페이스_활용.controller;

import j16_인터페이스_활용.service.UserService;

public class ApiController {
	
	private final UserService userService;
	
	public ApiController(UserService userService) {
		this.userService = userService;
	}
	
	public void addUser() {
		System.out.println("사용자추가");
		userService.create();
	}
	public void getUser() {
		System.out.println("사용자정보가져오기");
		userService.read();
	}
	public void modifiUser() {
		System.out.println("사용자정보수정");
		userService.update();
	}
	public void removeUser() {
		System.out.println("사용자삭제");
		userService.delete();
	}

}
