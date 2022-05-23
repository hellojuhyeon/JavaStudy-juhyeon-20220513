package j08_클래스;

public class FishBurnMain {

	public static void main(String[] args) {
		FishBurn fishBurn = new FishBurn(); //객체생성
		
		fishBurn.showInfo();
		fishBurn.material = "팥";
		fishBurn.dough= "부드러운 반죽";
		fishBurn.showInfo();
		
		
		System.out.println("===================================");
		
		FishBurn fishBurn2 = new FishBurn(); //객체생성
		
		fishBurn2.showInfo();
		fishBurn2.material = "슈크림";
		fishBurn2.dough= "퍽퍽한 반죽";
		fishBurn2.showInfo();
		fishBurn.showInfo();
		
		
		System.out.println(fishBurn);
		System.out.println(fishBurn2);
	}

}
