package j13_다형성;

public class FactoryMain {
	int i = 10;
	double d = i;
	Factory[] factorys = new Factory[5];
	//업캐스팅
	public static void main(String[] args) {
		SmartPhoneFactory smartPhoneFactory = new SmartPhoneFactory();
		ComputerFactory computerFactory = new ComputerFactory();
		
		smartPhoneFactory.start();
		computerFactory.start();
		
		
		

	}

}
