package j16_인터페이스_활용.service;

public class AuthUserService implements UserService{
	@Override
	public void create() {
		System.out.println("자회사 회원가입");
		
	}
	@Override
	public void delete() {
		System.out.println("자회사 회원가입을 통해 데이터 가져오기");
		
	}
	@Override
	public void read() {
		System.out.println("자회사 회원 정보수정");
		
	}
	@Override
	public void update() {
		System.out.println("자회사 회원탈퇴");
		
	}
}
