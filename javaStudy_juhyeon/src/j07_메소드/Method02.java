package j07_메소드;

//클래스 안에 정의된 함수를 메소드라고 한다.

public class Method02 {
	
	//매개변수가 없으면서 반환도 없는 메소드-------------
	                                                   //|
	public static void test1() {                       //|   
		System.out.println("test1 메소드 실행");       //| -----반환이없다 = void가 있다.  void뜻이 공허한
	}                                                  //|
                                                       //|
	//매개변수는 있고 반환이 없는 메소드------------------
	public static void test2(int age, int year) {
		System.out.println("나이:" + age);
		System.out.println("년도:" + year);
	}
	
	//매개변수가 없고 반환이 있는 메소드
	public static String test3() {                 //----------반환이 있다 = String 지정한 함수밖에 못씀
		return "강주현";
	}
	
	public static int test4() {
		return 10000;
	}
	
	//매개변수도 있고, 반환도 있는 메소드
	
	public static String test5(String name, int num) {
		return name + num;
	}
	
	//리턴 자료형이 void일때 메소드를 강제로 탈출하는 방법
	public static void test6() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
//				return;                          //중간에 6에서 리턴을 받아 메소드를 강제로 빠져나온다!
				break;                           //브레이크는 반복만 멈추는것이다.
			}
		}
		System.out.println("test6가 정상종료되었습니다.");
	}
	
		
	
	public static void main(String[] args) {
		
		System.out.println("메인함수 시작");
		test1();
		test2(29, 1994);
		String name = test3();
		test6();
		System.out.println("메인함수 종료");
		System.out.println(test5("강주현",1));
	}
		

}
