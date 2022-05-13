package j02_변수;

public class MyInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 메모, 필기
		 *
		 *name1, name2, name3
		 *각각의 name에 이름 한글자씩
		 *age(나이)
		 *phone(연락처)
		 *address(주소)
		 *
		 *
		 *이름:강주현
		 *나이:29
		 *연락처:010-2670-9459
		 *주소:부산 동래구 낙민동
		 *
		 *
		 */
		
		char	 name1 = '강';
		char	name2 = '주';
		char	name3 = '현';
		int age = 29;
		String phone = "010-2670-9459";  /*다른 자료형이랑 좀 다름! 큰따옴표로 감싸줘야한다.*/
		String address = "부산광역시 동래구 낙민동";
				
		System.out.print("이름: ");
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		System.out.println("이름 : "+ name1 + name2 + name3);
		
		System.out.print("나이: ");
		System.out.println(age);
		
		System.out.println("세 수의 합 : " + (10 + 20 +30));
		
		System.out.print("연락처: ");
		System.out.println(phone);
		
		System.out.print("주소: ");
		System.out.print(address);
	}

}
