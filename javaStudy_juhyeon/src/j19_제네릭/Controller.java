package j19_제네릭;

public class Controller {
	public Object createUser() {
		return new CMRespDto(1, "회원추가 성공", "aaaa, 1234");
	}
	public Object updateUser() {
		return new CMRespDto(1, "회원정보(나이) 수정 성공", "29");
	}
}
