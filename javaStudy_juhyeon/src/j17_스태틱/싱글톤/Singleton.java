package j17_스태틱.싱글톤;
/*
 * 생성자는 private로 지정하여 외부에서 생성할 수 없게 만들어야 한다.
 * 싱글톤으로 설계된 클래스의 유일한 인스턴스를 리턴해줄 수 있는 
 * getInstance() static메소드가 존재하여야 한다.
 */

public class Singleton {
	private static Singleton instance = new Singleton();
	private int count; //스태틱 메소드에서는 일반 변수를 쓸 수 없다.
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance(){
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void printInfo() {
		System.out.println("싱글톤테스트" + count);
	}
}
