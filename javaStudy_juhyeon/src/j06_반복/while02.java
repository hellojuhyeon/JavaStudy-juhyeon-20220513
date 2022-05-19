package j06_반복;

public class while02 {

	public static void main(String[] args) {
		//구구단 2단 출력
		/* 2x1 = 2
		 * 2x2 = 4
		 * ...
		 * 2x9 = 18
		 * 
		 */
		int dan = 2;
		int num = 0;
		
		 while(num<9) {
			System.out.println(dan + "x" + (num + 1) + " = " + dan * (num+1));
			num++;
		}
		

	}

}
