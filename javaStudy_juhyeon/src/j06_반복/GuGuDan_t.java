package j06_반복;

public class GuGuDan_t {

	public static void main(String[] args) {
		for (int dan = 0; dan<8; dan++) {
			System.out.println((dan+2) + "단");
			for (int i=0;i<9;i++) {
				int result = (dan+2) * (i+1);
				System.out.println((dan+2) + "x" + (i+1) + "=" + result);
			}
			System.out.println();
		}


	}

}
