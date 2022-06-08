package j23_예외처리;

public class ArrayException01 {
/*
 * 
 * 프로그램오류
 * 1.예외[프로그램실행중]   RuntimeException
 * 2.컴파일 에러[프로그램실행도안댐;]->예외)드라이버오류 IOException
 * 3.버그
 * 
 * 
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		try {
		for(int i = 0; i < numbers.length + 1; i++) {
			System.out.println("index" + i + ":" + numbers[i]);
		}
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println(e);
		System.out.println("StringIndexOutOfBoundsException예외가 발생하였음.");
	}catch(Exception e) {//항상 밑에 있어야함
		System.out.println(e);
	}
		System.out.println("지금까지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
	}

}
