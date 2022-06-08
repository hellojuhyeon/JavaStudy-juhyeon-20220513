package j23_예외처리;

public class ValidationcustomException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public ValidationcustomException() {
		super();
		System.out.println("우리가 만든 예외");
	}
	public ValidationcustomException(String message) {
		super(message);
		System.out.println("우리가 만든 예외");
	}
}
