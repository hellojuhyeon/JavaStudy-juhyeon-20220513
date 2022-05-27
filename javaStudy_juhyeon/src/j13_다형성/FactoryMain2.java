package j13_다형성;

public class FactoryMain2 {

	//업캐스팅을 하는이유:하나로 묶기위해서!!
	//하나로 묶는이유:반복작업을 하기위해서!!
	
	public static void main(String[] args) {
		
		Factory[] factorys = new Factory[100];
//		
//		factorys[0] = new SmartPhoneFactory();
//		factorys[1] = new ComputerFactory();
		
		for(int i = 0 ; i < factorys.length; i++) {
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
			// 삼항연산자i가 짝수이면 스마트폰 팩토리 가동, 
			//i가 짝수가 아니면 컴퓨터팩토리 가동
			
		}
		for(Factory factory : factorys) {
			factory.start();
		}
		
		int i = 10;
		double d = i;
		int ii = (int)d; //인트를 더블로 바꾸고 더블을 다시 인트로 바꿈
		
		System.out.println();
		
		for(Factory factory : factorys) {
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf = (SmartPhoneFactory)factory;
				spf.showSmartPhone();
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
			}else {
				System.out.println("다운캐스팅이 불가능합니다.");
			}
			
		}
	}

}
