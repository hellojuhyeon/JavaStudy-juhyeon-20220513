package j14_추상;
/*
 * abstract-추상
 * 메소드 자료형 앞, 접근지정자 뒤에 사용함.
 * 
 * 추상메소드
 * 1.return type앞에 abstract 키워드가 붙는다.
 * 2.추상메소드는 일반 클래스 안에 선언할 수 없다.
 * 3.상속 또는 구현된 클래스에서 무조건 override(재정의) 가 되어야한다.
 * 
 * 
 * 추상클래스
 * 
 * 
 * 1.클래스명 type 앞에 abstract 키워드가 붙는다.
 * 2.추상클래스는 생성 할 수 없다.
 * 3.추상메소드를 포함할 수 있다. 하지만 추상메소드를 꼭 포함하지 않아도 된다.
 * 
 * 
 */


//추상클래스
public abstract class Factory {
	
	//추상메소드
	public abstract void start() ;//오버라이드를 꼭 해야한다.
	
	//일반메소드
	public void stop() {
		System.out.println("공장을 멈춥니다.");//오버라이드를 꼭 하지않아도 된다.
	}
	//프리베이트 메소드는 절대 상속되지않는다.
	private void test() {
		
	}
	
}
