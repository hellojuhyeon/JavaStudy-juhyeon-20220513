package j08_클래스;
/*
 * 1.Car 클래스를 만든다. 
 * 2.Car 클래스의 속성(변수) 회사 제조사(Company), 모델(Model), color(색상)
 * 3.Car 클래스의 기능(메소드)
 * showCompanyInfo() -> 000회사에서 제조된 차량입니다.
 * showInfoAll()->제조사:000 모델:00 색상:00
 * getCar()->return "KIA_K5_화이트"
 * setColor() -> 매개변수에 색상을 받아서 color 변수의 값을 변경
 * 
 * 기아 k7 블랙 setColor(블루)
 * 현대 쏘나타 화이트 setColor(그레이)
 * 테슬라 모델3 레드 setColor(그린)
 */
public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		car1.company = "KIA";
		car1.model = "K5";
		car1.color = "화이트";
	
		

		car2.company = "현대";
		car2.model = "쏘나타";
		car2.color = "블랙";
	
		

		car3.company = "Tesla";
		car3.model = "Model3";
		car3.color = "레드";
	
		System.out.println();
		
		car1.showCompanyInfo();
		car1.showInfoAll();
		car2.showCompanyInfo();
		car2.showInfoAll();
		car3.showCompanyInfo();
		car3.showInfoAll();
		
		System.out.println();
		
		System.out.println(car1.getCar());
		System.out.println(car2.getCar());
		System.out.println(car3.getCar());
		
		System.out.println();
		
		car1.setColor("블루");
		car2.setColor("그레이");
		car3.setColor("그린");
		
		car1.showInfoAll();
		car2.showInfoAll();
		car3.showInfoAll();
	}

}
