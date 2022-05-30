package j14_추상;

public class SamsungFactory extends Factory {
	@Override
	public void start() {
		System.out.println("3sung팩토리 가동");
		
	}
	@Override
	public void stop() {
		System.out.println("샘숭 공장을 정지");
	}
}
