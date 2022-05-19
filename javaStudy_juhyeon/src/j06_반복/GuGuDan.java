package j06_반복;

public class GuGuDan {

	public static void main(String[] args) {
		
			for(int i = 0; i < 8; i++) { //--------------------------X단 지정 i초기값 0, i<8 반복횟수8회
				//[2단부터 시작하는 탓]
				System.out.println((i+2) + "단 출력");
				
				for(int j=0; j<9; j++) { //-----------Y 곱 지정 j 초기값 0, j<9 반복횟수 9회
					System.out.println((i+2) + "x" + (j+1) + "=" + (i+2) * (j+1));
					                
					
				}
				System.out.println();
			}

	}

}
