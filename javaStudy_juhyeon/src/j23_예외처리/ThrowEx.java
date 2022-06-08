package j23_예외처리;

public class ThrowEx {

	public static void main(String[] args) {
		try {
			System.out.println("프로그램실행중...");
			int i = 0;
			
			
			if(i==0) {
			throw new ValidationcustomException("예외발생");
			}
			
		} catch (Exception e) {
			e.printStackTrace();//예외가 발생했을 때 처리하는부분
		}finally {
			System.out.println("무조건 실행");
		}

	}

}
