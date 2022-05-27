package j12_상속.동물;
/*
 * @어노테이션
 * 
 * @Override(재정의)
 * 상위 클래스 또는 인터페이스가 가지고 있는 메소드를 재정의 하겠다 라는 의미.
 * 
 */
public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
		Tiger tiger = new Tiger();
		
		animal.move();
		human.move();
		tiger.move();
		human.readBooks();
		tiger.hunting();
		
		

	}

}
