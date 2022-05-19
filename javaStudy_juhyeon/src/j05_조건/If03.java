package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		System.out.println("등급 산출 시작");
		
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		System.out.print("점수를 입력하세요: ");
		score = scanner.nextInt();
		if(score>100||score<0) {
			System.out.println("입력할 수 없는 점수입니다.");
		}else if(score>89) {
			System.out.println("등급:A");
		}else if(score>79) {
			System.out.println("등급:B");
		}else if(score>69) {
			System.out.println("등급:C");
		}else if(score>59){			
			System.out.println("등급:D");
		}else {
			System.out.println("등급:F");
		}
		System.out.println("등급 산출 종료");

	}

}
