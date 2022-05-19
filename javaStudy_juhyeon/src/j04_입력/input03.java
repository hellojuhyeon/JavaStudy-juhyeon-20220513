package j04_입력;

import java.util.Scanner;

public class input03 {

	public static void main(String[] args) {
		
		/*[개인정보 입력]
		 * 입력: 강주현   문자열
		 * 나이:29 정수
		 * 연락처:010-9988-1916 문자열
		 * 주소:부산 동래구 사직동 문자열 
		 * 성별: 남 문자
		 * 
		 * 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		
		String name = null;
		double age = 0;
		String phone = null;
		String address = null;
		char gender = 0;
		
		
		System.out.print("이름입력 : ");
		name = scanner.next();
		System.out.print("나이 입력 : ");
		age = scanner.nextInt();
		System.out.print("연락처 입력 :");
		phone = scanner.next();
		scanner.nextLine();
		System.out.print("주소 입력 : ");
		address = scanner.nextLine();
		System.out.print("성별 입력 : ");
		gender = scanner.next().charAt(0);
		
		System.out.println("[개인정보 출력]");  		//김준일\n29\n010-2670-9459\n부산광역시 동래구 낙민동
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("연락처 : "+ phone);
		System.out.println("주소 : "+ address);
		System.out.println("성별 : "+ gender);
		
	}

}
