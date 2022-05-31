package j17_스태틱;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t.count = 10;
		t2.count = 20;
		t3.count = 30;
		
		t.method();
		t2.method();
		t3.method();
		
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();

		
		st1.count = 10;
		st2.count = 20;
		st3.count = 30;

		StaticTest.count = 100; //메모리 주소로 인해 고정되며, 다른 스태틱 메소드와 공유한다.
		
		st1.staticMethod();//스태틱은 변수가 누워있다.
		st2.staticMethod();
		st3.staticMethod();
		
		StaticTest.staticMethod();

		
	}

}
