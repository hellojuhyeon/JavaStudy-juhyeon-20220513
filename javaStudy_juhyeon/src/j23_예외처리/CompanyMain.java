package j23_예외처리;

import java.util.ArrayList;

/*
 * printCompanies() 메소드에서 예외를 미룬다(throws)
 * printCompanies() 메소드를 호출한 지점에서 예외처리를 한다
 * NullPointException 처리를 한다. 메세지 내용 : 해당 주소에는 Company 객체가 존재하지 않습니다.
 */
public class CompanyMain {
	public void printCompanies(ArrayList<Company>companies) throws Exception{
		for(Company c: companies) {
			System.out.println("회사명:" + c.getName());
			System.out.println("주소:" + c.getAddress());
		}
	}
	
	
	public static void main(String[] args) {
		CompanyMain companyMain = new CompanyMain();
		ArrayList<Company> companies = new ArrayList<Company>();
		
		
		companies.add(new Company("LG","구미"));
		companies.add(new Company("삼성전기","부산"));
		companies.add(new Company("apple","실리콘밸리"));
		companies.add(null);
		companies.add(new Company("google","실리콘밸리"));
		
		try {
			companyMain.printCompanies(companies);

		}catch(Exception e){
			System.out.println("해당 주소에는 Company 객체가 존재하지 않습니다.");
			e.printStackTrace();
		}finally {
			System.out.println("회사정보 출력완료");
	}
		System.out.println("프로그램종료");
	}
	
}
