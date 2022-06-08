package j23_예외처리;

public class Throws01 {
	public void printArray(int[] arrays) throws Exception {//무조건 예외가 나오는 강제성을 만듦
		           
		
		for(int i = 0; i < arrays.length+1; i++) {
			System.out.println("index" + i + ":" + arrays[i]);
		}
	}
}
