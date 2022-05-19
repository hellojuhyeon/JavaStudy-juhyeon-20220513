package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		System.out.println("사분면 측정 시작");
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("X좌표에 해당하는 숫자를 입력하세요: ");
		x = scanner.nextInt();
		System.out.println("Y좌표에 해당하는 숫자를 입력하세요: ");
		y = scanner.nextInt();	
		if(x>999 || y>999 || x==0 || y==0 || x<-999 || y<-999) {
			System.out.println("계산할 수 없습니다.");    //((x>1000 || y>1000 || x<-1000 || y-1000 || x==0 || y==0)&&(x!=0 || y!=0))
		}else if (x==0 && y==0) {
			System.out.println("원점입니다.");
		}else if (x<0 && y<0) {
			System.out.println("3사분면 입니다.");
		}else if (x<0 && y>0) {
			System.out.println("2사분면 입니다.");
		}else if (x>0 && y>0) {
			System.out.println("1사분면 입니다.");
		}else if (x>0 && y<0) {
			System.out.println("4사분면 입니다.");
		}
		String result = (x > 1000 || y > 1000 || x < -1000 || y < -1000 || x==0 || y==0)
				&&(x!=0 && y!=0) ? "계산불가"
						:x>0 && y>0 ? "1사분면"
								: x<0 && y>0 ? "2사분면"
										:x<0 && y<0 ? "3사분면"
												:x>0 && y<0 ? "4사분면":"원점";
		System.out.println(result);
		
		
		System.out.println("사분면 측정 종료");
		}
	
		
		
												
												
										
									
				

}
