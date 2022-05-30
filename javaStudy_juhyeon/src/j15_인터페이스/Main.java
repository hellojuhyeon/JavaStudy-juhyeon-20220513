package j15_인터페이스;

public class Main {

	public static void main(String[] args) {
		BeamProjector beamProjector = new BeamProjector();
		Monitor monitor = new Monitor();
		
		SmartPhone smartPhone = new SmartPhone(beamProjector);
		smartPhone.powerOn();
		smartPhone.powerOff();
	}

}
