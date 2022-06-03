package j19_제네릭;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println(controller.createUser().toString());
		System.out.println(controller.updateUser().toString());

	}

}
